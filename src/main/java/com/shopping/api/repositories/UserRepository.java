package com.shopping.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.api.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {}
