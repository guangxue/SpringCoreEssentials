package com.guangxuezhang.model;

public class Product {
    private String item_num;
    private String item_category;
    private String item_name;
    private String item_code;

    public Product() {}

    public void setItem_num(String item_num) {
        this.item_num = item_num;
    }

    public void setItem_category(String item_category) {
        this.item_category = item_category;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public void setItem_code(String item_code) {
        this.item_code = item_code;
    }

    public String getItemNum() { return item_num; }
    public String getItemCategory() { return item_category; }
    public String getItemName() { return item_name; }
    public String getItemCode() { return item_code; }

    public String toString() {
        return "Product [item_num=" + item_num + ", item_category=" + item_category + ", item_name="+item_name+", item_code="+item_code+"]";
    }
}
