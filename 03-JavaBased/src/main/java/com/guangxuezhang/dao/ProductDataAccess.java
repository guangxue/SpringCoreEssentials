package com.guangxuezhang.dao;

import com.guangxuezhang.model.Product;
import com.guangxuezhang.model.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
        String sql = "select * from hongfa.birch_product_info where item_code = ?";
        Product zipper = jdbcTemplate.queryForObject(sql, new ProductMapper());
        return Optional.ofNullable(zipper);
    }
}
