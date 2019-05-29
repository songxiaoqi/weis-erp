package com.song.erp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 用户登陆，会被AuthenticationProcessingFilter拦截，
 * 调用AuthenticationManager的实现，而且AuthenticationManager会调用ProviderManager来获取用户验证信息
 * （不同的Provider调用的服务不同，因为这些信息可以是在数据库上，可以是在LDAP服务器上，可以是xml配置文件上等）
 * ，如果验证通过后会将用户的权限信息封装一个User放到spring的全局缓存SecurityContextHolder中，以备后面访问资源时使用。
 */

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .formLogin().loginPage("/login").loginProcessingUrl("/login.do").failureUrl("/login.error").permitAll()  //表单登录，permitAll()表示这个不需要验证 登录页面，登录失败页面
            .and()
            .authorizeRequests().anyRequest().authenticated()
            .and()
            .csrf().disable();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("111").password(new BCryptPasswordEncoder().encode("123456")).roles("USER");
    }
}
