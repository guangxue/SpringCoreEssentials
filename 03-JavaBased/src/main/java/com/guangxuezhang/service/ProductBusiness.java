package com.guangxuezhang.service;

import com.guangxuezhang.dao.ProductDAO;
import com.guangxuezhang.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductBusiness implements ProductService {
    private final ProductDAO productDAO;

    @Autowired
    public ProductBusiness(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public Optional<Product> getByItemCode(String itemCode) {
        return this.productDAO.getByItemCode(itemCode);
    }
}
