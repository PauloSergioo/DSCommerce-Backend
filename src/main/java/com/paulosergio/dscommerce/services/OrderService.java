package com.paulosergio.dscommerce.services;


import com.paulosergio.dscommerce.dto.OrderDTO;
import com.paulosergio.dscommerce.dto.ProductDTO;
import com.paulosergio.dscommerce.entities.Order;
import com.paulosergio.dscommerce.entities.Product;
import com.paulosergio.dscommerce.repositories.OrderRepository;
import com.paulosergio.dscommerce.repositories.ProductRepository;
import com.paulosergio.dscommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id) {
        Order order = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));
        return  new OrderDTO(order);
    }
}
