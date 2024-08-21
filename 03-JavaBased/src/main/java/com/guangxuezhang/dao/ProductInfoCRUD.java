package com.guangxuezhang.dao;

import com.guangxuezhang.model.ProductInfo;

import java.util.List;
import java.util.Optional;

public class ProductInfoCRUD implements ProductInfoDAO {
    private List<ProductInfo> proudctList;

    public ProductInfoCRUD() {
        proudctList.add(new ProductInfo("0138", "PC3","013812-294MUSTAN", "PC3-12-394"));
        proudctList.add(new ProductInfo("0138", "PC3","013818-615HUNTER", "PC3-18-615"));
    }

    @Override
    public Optional<ProductInfo> getByItemCode(String itemCode) {
        for (ProductInfo product : proudctList) {
            if(product.getItemCode().equals(itemCode)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
}
