package com.guangxuezhang.dao;

import com.guangxuezhang.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public class ProductDataAccess implements ProductDAO {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public ProductDataAccess(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Optional<Product> getByItemCode(String itemCode) {
        return Optional.empty();
    }
}
