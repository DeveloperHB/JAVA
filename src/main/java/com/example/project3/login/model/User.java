package com.example.project3.login.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;  // jakarta.persistence.Id로 수정
import jakarta.persistence.Table;

@Entity(name = "UserEntity2")
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;  // 필드 값 반환으로 수정
    }

    public void setUsername(String username) {
        this.username = username;  // Setter 추가
    }

    public String getPassword() {
        return password;  // 필드 값 반환으로 수정
    }

    public void setPassword(String password) {
        this.password = password;  // Setter 추가
    }

    public String getRole() {
        return role;  // 필드 값 반환으로 수정
    }

    public void setRole(String role) {
        this.role = role;  // Setter 추가
    }
}