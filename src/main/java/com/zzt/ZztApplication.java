package com.zzt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude ={DataSourceAutoConfiguration.class})
public class ZztApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZztApplication.class, args);
    }

}
