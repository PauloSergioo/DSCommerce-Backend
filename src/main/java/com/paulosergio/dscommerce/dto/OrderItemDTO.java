package com.paulosergio.dscommerce.dto;

import com.paulosergio.dscommerce.entities.OrderItem;

public class OrderItemDTO {

    private Long ProductId;
    private String name;
    private Double price;
    private Integer quantity;
    private String imgUrl;

    public OrderItemDTO(Long productId, String name, Double price, Integer quantity, String imgUrl) {
        ProductId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.imgUrl = imgUrl;
    }

    public OrderItemDTO(OrderItem entity) {
        ProductId = entity.getProduct().getId();
        name = entity.getProduct().getName();
        price = entity.getPrice();
        quantity = entity.getQuantity();
        imgUrl = entity.getProduct().getImgUrl();

    }

    public Long getProductId() {
        return ProductId;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getSubTotal() {
        return price * quantity;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
