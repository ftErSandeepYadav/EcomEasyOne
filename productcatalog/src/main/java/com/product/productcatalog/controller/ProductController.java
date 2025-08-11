package com.product.productcatalog.controller;

import com.product.productcatalog.entity.Product;
import com.product.productcatalog.service.ProdcutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {

    @Autowired
    private ProdcutService prodcutService;

    // Endpoint to get all products
     @GetMapping
     public List<Product> getAllProducts() {
         System.out.println("Fetching all products");
         return prodcutService.getAllProducts();
     }

     @GetMapping("/category/{categoryId}")
    public List<Product> getProductsByCategoryId(@PathVariable Long categoryId) {
         return prodcutService.getProductsByCategoryId(categoryId);
     }

}
