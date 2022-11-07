package com.guschenko.coffeehouse.model;

import com.guschenko.coffeehouse.enumeration.ProductType;

import java.math.BigDecimal;

public class Product {
    private Integer productId;
    private String name;
    private BigDecimal price;
    private ProductType type;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }
}
