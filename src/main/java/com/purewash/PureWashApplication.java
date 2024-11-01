package com.purewash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class PureWashApplication {

    public static void main(String[] args) {
        SpringApplication.run(PureWashApplication.class, args);
    }

}
