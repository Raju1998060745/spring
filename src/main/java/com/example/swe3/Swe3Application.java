package com.example.swe3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.swe3")
public class Swe3Application {

    public static void main(String[] args) {
        SpringApplication.run(Swe3Application.class, args);
    }

}
