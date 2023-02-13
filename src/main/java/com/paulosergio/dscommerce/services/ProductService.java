package com.paulosergio.dscommerce.services;

import com.paulosergio.dscommerce.dto.ProductDTO;
import com.paulosergio.dscommerce.entities.Product;
import com.paulosergio.dscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;
    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Product product = repository.findById(id).get();
        return  new ProductDTO(product);

    }
}
