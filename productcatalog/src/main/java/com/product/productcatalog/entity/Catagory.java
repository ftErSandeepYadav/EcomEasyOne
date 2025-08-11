package com.product.productcatalog.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Catagory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "catagory", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Product> products;
}