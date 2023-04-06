package com.shopping.api.dto;

import com.shopping.api.models.Product;

public record ProductResponseDTO(Long id, Integer price, String name, String imageUrl) {
  public ProductResponseDTO(Product product) {
    this(product.getId(), product.getPrice(), product.getName(), product.getImageUrl());
  }
}
