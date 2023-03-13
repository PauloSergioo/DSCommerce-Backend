package com.paulosergio.dscommerce.repositories;

import com.paulosergio.dscommerce.entities.OrderItem;
import com.paulosergio.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
