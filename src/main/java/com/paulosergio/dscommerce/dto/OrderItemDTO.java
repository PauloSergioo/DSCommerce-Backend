package com.paulosergio.dscommerce.dto;

import com.paulosergio.dscommerce.entities.OrderItem;

public class OrderItemDTO {

    private Long ProductId;
    private String name;
    private Double price;
    private Integer quantity;

    public OrderItemDTO(Long productId, String name, Double price, Integer quantity) {
        ProductId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public OrderItemDTO(OrderItem entity) {
        ProductId = entity.getProduct().getId();
        this.name = entity.getProduct().getName();
        this.price = entity.getPrice();
        this.quantity = entity.getQuantity();
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
}
