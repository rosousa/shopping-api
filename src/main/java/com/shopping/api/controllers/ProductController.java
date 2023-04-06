package com.shopping.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.api.models.Product;
import com.shopping.api.repositories.ProductRepository;

@RestController
@RequestMapping("/api/product")
public class ProductController {
  @Autowired
  private ProductRepository repository;
  
  @GetMapping
  public List<Product> getProducts() {
    List<Product> products = repository.findAll();
    return products;
  }

  @GetMapping("/{id}")
  public Product getProduct(@PathVariable Long id) {
    Product product = repository.findById(id).orElse(null);
    return product;
  }
}
