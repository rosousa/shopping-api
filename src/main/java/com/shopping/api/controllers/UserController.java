package com.shopping.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.api.dto.UserRequestDTO;
import com.shopping.api.models.UserModel;
import com.shopping.api.repositories.UserRepository;

@RestController
@RequestMapping("/api/user")
public class UserController {

  @Autowired
  private UserRepository repository;
  
  @PostMapping
  public String createUser(@RequestBody UserRequestDTO req) {
    repository.save(new UserModel(req));
    return "ok";
  }
}
