package com.stackroute.foodie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(scanBasePackages= {"com.stackroute.foodie"})
public class MainClass {

    public static void main(String[] args) {
        SpringApplication.run(MainClass.class, args);
    }
}
