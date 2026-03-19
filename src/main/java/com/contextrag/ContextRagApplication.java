package com.contextrag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the ContextRAG Spring Boot application.
 */
@SpringBootApplication
public class ContextRagApplication {

    /**
     * Boots the Spring application context.
     *
     * @param args command-line arguments passed at startup
     */
    public static void main(String[] args) {
        SpringApplication.run(ContextRagApplication.class, args);
    }
}
