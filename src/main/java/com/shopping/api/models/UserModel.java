package com.shopping.api.models;

import com.shopping.api.dto.UserRequestDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "users")
@Table(name = "users")
@NoArgsConstructor
public class UserModel {
  public UserModel(UserRequestDTO data) {
    this.username = data.username();
    this.email = data.email();
    this.password = data.password();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(length = 20, nullable = false)
  private String username;

  @Column(unique = true, length = 150, nullable = false)
  private String email;

  @Column(length = 30, nullable = false)
  private String password;
}
