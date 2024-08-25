package com.guangxuezhang.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
       Product prod = new Product();
       prod.setItem_num(rs.getString("item_num"));
       prod.setItem_name(rs.getString("item_name"));
       prod.setItem_category(rs.getString("item_category"));
       prod.setItem_code(rs.getString("item_code"));
       return prod;
    }
}
