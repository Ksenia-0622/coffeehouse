package com.guschenko.coffeehouse.dto.coffee;

import java.util.UUID;

public class CoffeeOld {
    private final String id;
    private String name;
    public CoffeeOld(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public CoffeeOld(String name) {
        this (UUID.randomUUID().toString(),name);

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
