package com.shopping.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.api.dto.ProductResponseDTO;
import com.shopping.api.repositories.ProductRepository;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/product")
public class ProductController {
  @Autowired
  private ProductRepository repository;
  
  @GetMapping
  public List<ProductResponseDTO> getProducts() {
    List<ProductResponseDTO> products = repository.findAll().stream().map(ProductResponseDTO::new).toList();
    return products;
  }
}
