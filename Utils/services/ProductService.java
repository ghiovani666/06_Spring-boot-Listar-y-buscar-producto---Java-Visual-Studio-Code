package com.example.prueba01.prueba.services;

import java.util.List;
import java.util.Optional;

import com.example.prueba01.prueba.entities.Product;

public interface ProductService {

    List<Product> findAll();

    Optional<Product> findById(Long id);
}
