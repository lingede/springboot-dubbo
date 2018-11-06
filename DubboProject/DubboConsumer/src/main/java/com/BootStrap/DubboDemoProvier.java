package com.BootStrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@EnableDubbo
@ComponentScan(basePackages = {"com.controller","testController"})
//@DubboComponentScan(basePackages = {"com.controller"})
public class DubboDemoProvier {

    public static void main(String[] args) {

        SpringApplication.run(DubboDemoProvier.class, args);

    }
}
