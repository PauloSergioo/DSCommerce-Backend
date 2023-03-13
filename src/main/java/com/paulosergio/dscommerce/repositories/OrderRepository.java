package com.paulosergio.dscommerce.repositories;

import com.paulosergio.dscommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
