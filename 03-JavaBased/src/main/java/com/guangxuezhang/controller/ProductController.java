package com.guangxuezhang.controller;

import com.guangxuezhang.model.Product;
import com.guangxuezhang.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public void findZipperByItemCode(String itemCode) {
        System.out.println(this.productService.getByItemCode(itemCode));
    }

}
