package com.product.productcatalog.service;

import com.product.productcatalog.entity.Category;
import com.product.productcatalog.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired private CategoryRepository catagoryRepository;

    public List<Category> getAllCategories() {
        return catagoryRepository.findAll() ;
    }
}
