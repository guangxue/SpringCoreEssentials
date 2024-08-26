package com.guangxuezhang.dao;

import com.guangxuezhang.model.Product;
import java.util.Optional;

public interface ProductDAO {
   Optional<Product> getByItemName(String itemName);
}
