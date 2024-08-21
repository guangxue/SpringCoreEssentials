package com.guangxuezhang.dao;

import com.guangxuezhang.model.ProductInfo;
import java.util.Optional;

public interface ProductInfoDAO {
   Optional<ProductInfo> getByItemCode(String itemCode);
}
