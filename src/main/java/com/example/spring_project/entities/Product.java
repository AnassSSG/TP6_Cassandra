package com.example.spring_project.entities;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table("products")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Product {
    @PrimaryKey
    private UUID id;
    private String name;
    private double price;
    private int quantiteStock;

}
