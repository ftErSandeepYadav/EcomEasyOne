package com.product.productcatalog.service;

import com.product.productcatalog.entity.Catagory;
import com.product.productcatalog.repository.CatagoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatagoryService {

    @Autowired private CatagoryRepository catagoryRepository;

    public List<Catagory> getAllCatagories() {
        return catagoryRepository.findAll() ;
    }
}
