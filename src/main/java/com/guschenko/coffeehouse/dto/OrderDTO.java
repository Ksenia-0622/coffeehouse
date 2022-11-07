package com.guschenko.coffeehouse.dto;

import java.util.List;

public class OrderDTO {
    private Integer clientId;
    private List<GoodsDTO> listGoods;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public List<GoodsDTO> getListGoods() {
        return listGoods;
    }

    public void setListGoods(List<GoodsDTO> listGoods) {
        this.listGoods = listGoods;
    }
}
