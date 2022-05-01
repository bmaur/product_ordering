package com.task.products_ordering;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class ProductsOrderingApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProductsOrderingApplication.class, args);

    }

}
