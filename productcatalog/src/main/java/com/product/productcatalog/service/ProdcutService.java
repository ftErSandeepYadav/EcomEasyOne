package com.product.productcatalog.service;

import com.product.productcatalog.entity.Product;
import com.product.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdcutService {

    @Autowired private ProductRepository productRepository ;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

}
