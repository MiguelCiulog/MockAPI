package com.miguelciulog.mockapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class MockApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(MockApiApplication.class, args);
    }
}
