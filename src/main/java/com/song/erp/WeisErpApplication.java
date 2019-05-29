package com.song.erp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.song.erp.mapper")
@SpringBootApplication
@ComponentScan(basePackages = {"com.song.*"})
public class WeisErpApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeisErpApplication.class, args);
    }

}
