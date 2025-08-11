package com.product.productcatalog.controller;

import com.product.productcatalog.entity.Catagory;
import com.product.productcatalog.service.CatagoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/catagories")
public class CatagoryController {

    @Autowired private CatagoryService catagoryService;

    @GetMapping
    public List<Catagory> getAllCatagories(){
        return catagoryService.getAllCatagories();
    }

}
