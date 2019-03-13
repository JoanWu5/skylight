package com.skyLight.skyLight;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.skyLight.skyLight.dao")
public class TreeholeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TreeholeApplication.class, args);
    }
}
