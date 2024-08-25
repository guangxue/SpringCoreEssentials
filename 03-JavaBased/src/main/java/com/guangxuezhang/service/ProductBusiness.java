package com.guangxuezhang.service;

import com.guangxuezhang.dao.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductBusiness implements ProductService {
    private ProductDAO productDAO;

    @Autowired
    public ProductBusiness(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

}
