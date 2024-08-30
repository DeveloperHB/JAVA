package com.example.project3.login.service;

import com.example.project3.login.model.User;
import com.example.project3.login.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void registerUser(String username, String password, String role) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password)); // 패스워드 암호화
        user.setRole(role);
        userRepository.save(user);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public void updateUser(User user) {
        // Find the user by username
        User existingUser = userRepository.findByUsername(user.getUsername());
        if (existingUser != null) {
            existingUser.setRole(user.getRole());
            // If password is provided, update it
            if (user.getPassword() != null && !user.getPassword().isEmpty()) {
                existingUser.setPassword(passwordEncoder.encode(user.getPassword()));
            }
            userRepository.save(existingUser);
        }
    }

    public void deleteUser(String username) {
        userRepository.deleteByUsername(username);
    }
}