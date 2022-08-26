package com.miaowu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.miaowu.mapper")
public class MiaowuApplication {
    public static void main(String[] args) {
        SpringApplication.run(MiaowuApplication.class,args);
    }
}
