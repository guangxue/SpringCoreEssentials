package com.guangxuezhang.model;

public class ProductInfo {
    private String item_num;
    private String item_category;
    private String item_name;
    private String item_code;

    public ProductInfo(String item_num, String item_category, String item_name, String item_code) {
        this.item_num = item_num;
        this.item_category = item_category;
        this.item_name = item_name;
        this.item_code = item_code;
    }

    public String getItemNum() { return item_num; }
    public String getItemCategory() { return item_category; }
    public String getItemName() { return item_name; }
    public String getItemCode() { return item_code; }
}
