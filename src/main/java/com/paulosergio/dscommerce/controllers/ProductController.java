package com.paulosergio.dscommerce.controllers;

import com.paulosergio.dscommerce.dto.ProductDTO;
import com.paulosergio.dscommerce.entities.Product;
import com.paulosergio.dscommerce.repositories.ProductRepository;
import com.paulosergio.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id) {
       return service.findById(id);
    }
}