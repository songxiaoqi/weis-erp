package com.song.erp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.song.erp.mapper")
@SpringBootApplication
public class WeisErpApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeisErpApplication.class, args);
    }

}
