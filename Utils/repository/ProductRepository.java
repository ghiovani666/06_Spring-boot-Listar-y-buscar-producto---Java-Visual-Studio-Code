package com.example.prueba01.prueba.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.prueba01.prueba.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{}
