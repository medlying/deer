package com.sodacar.deer.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author bosong
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.sodacar.deer", "com.sodacar.commons"})
@MapperScan("com.sodacar.deer.dao.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
