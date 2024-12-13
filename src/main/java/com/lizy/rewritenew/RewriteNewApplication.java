package com.lizy.rewritenew;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lizy.rewritenew.mapper")
public class RewriteNewApplication {

    public static void main(String[] args) {
        SpringApplication.run(RewriteNewApplication.class, args);
    }

}
