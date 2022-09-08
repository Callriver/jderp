package com.jdsoft;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.jdsoft.orm.dao","com.jdsoft.orm.model"})
public class JderpApplication {

    public static void main(String[] args) {
        SpringApplication.run(JderpApplication.class, args);
    }

}
