package com.example.spring_project;


import com.example.spring_project.entities.Product;
import com.example.spring_project.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.UUID;


@SpringBootApplication
public class TpCassandraApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpCassandraApplication.class, args);
    }

    @Bean
    public CommandLineRunner dataLoader(ProductRepository productRepository) {
        return args -> {
            if (productRepository.count() == 0) {
                Product product1 = new Product();
                product1.setId(UUID.randomUUID());
                product1.setName("Product 1");
                product1.setPrice(10);
                product1.setQuantiteStock(100);

                Product product2 = new Product();
                product2.setId(UUID.randomUUID());
                product2.setName("Product 2");
                product2.setPrice(20);
                product2.setQuantiteStock(50);

                productRepository.saveAll(List.of(product1, product2));
            }
        };
    }
}