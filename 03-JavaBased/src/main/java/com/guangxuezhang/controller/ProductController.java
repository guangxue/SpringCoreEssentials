package com.guangxuezhang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {

    @Autowired
    public ProductController(ProductService productService) {}

    public void findAll() {
        List<Prouduct> products = productService.findAll();
        System.out.println("Product List" + products);
    }
}
