package com.product.productcatalog.controller;

import com.product.productcatalog.entity.Category;
import com.product.productcatalog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin(origins = "http://localhost:5173")
public class CatagoryController {

    @Autowired private CategoryService catagoryService;

    @GetMapping
    public List<Category> getAllCategories(){
        return catagoryService.getAllCategories();
    }

}
