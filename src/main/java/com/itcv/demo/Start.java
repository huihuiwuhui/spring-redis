package com.itcv.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = {"com.itcv.demo"},exclude={DataSourceAutoConfiguration.class})
@MapperScan("com.itcv.demo.sharding.dao")
public class Start {
    public static void main(String[] args) {
        SpringApplication.run(Start.class, args);
        /*SpringApplication app = new SpringApplication(Start.class);
      //  app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);*/
    }

}
