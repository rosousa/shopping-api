package com.shopping.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
