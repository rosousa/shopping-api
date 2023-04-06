package com.shopping.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.api.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}
