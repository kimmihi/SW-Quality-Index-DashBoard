package com.display.swqualityboardbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableBatchProcessing
@SpringBootApplication
@EnableScheduling
public class SwqualityboardbatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwqualityboardbatchApplication.class, args);
    }

}
