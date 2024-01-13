package com.goit;


import io.sentry.Sentry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ChatApplication {
    public static void main(String[] args) {
        Sentry.capture("Application started");
        SpringApplication.run(ChatApplication.class, args);
    }
}
