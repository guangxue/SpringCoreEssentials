package com.guangxuezhang.service;

import com.guangxuezhang.model.Product;

import java.util.Optional;

public interface ProductService {
    Optional<Product> getByItemName(String itemName);
}
