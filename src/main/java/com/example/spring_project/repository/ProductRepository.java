package com.example.spring_project.repository;

import com.example.spring_project.entities.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;


import java.util.List;
import java.util.UUID;

public interface ProductRepository extends CassandraRepository<Product, UUID> {
    List<Product> findByNameContaining(String keyword);
}
