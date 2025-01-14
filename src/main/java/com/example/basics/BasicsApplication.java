package com.example.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan
public class BasicsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicsApplication.class, args); // as run is a static method
//        SpringApplication springApplication = new SpringApplication(BasicsApplication.class);
//        springApplication.run();
    }

}
