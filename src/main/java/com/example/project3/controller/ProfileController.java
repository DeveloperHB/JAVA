package com.example.project3.controller;

import com.example.project3.login.model.User;
import com.example.project3.login.service.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/profile")
public class ProfileController {

    private final UserService userService;
    private final BCryptPasswordEncoder passwordEncoder;

    public ProfileController(UserService userService, BCryptPasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping
    public String profilePage(Authentication authentication, Model model) {
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        User user = userService.findByUsername(userDetails.getUsername());
        model.addAttribute("user", user);
        return "profile";
    }

    @PostMapping("/update")
    public String updateProfile(@ModelAttribute User user, Authentication authentication) {
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        user.setUsername(userDetails.getUsername()); // Ensure the username is not changed
        userService.updateUser(user);
        return "redirect:/profile";
    }

    @PostMapping("/change-password")
    public String changePassword(@RequestParam String oldPassword, @RequestParam String newPassword, Authentication authentication) {
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        User user = userService.findByUsername(userDetails.getUsername());

        if (passwordEncoder.matches(oldPassword, user.getPassword())) {
            user.setPassword(passwordEncoder.encode(newPassword));
            userService.updateUser(user);
            return "redirect:/profile";
        }

        // Handle incorrect old password scenario
        return "redirect:/profile?error";
    }

    @PostMapping("/delete")
    public String deleteAccount(Authentication authentication) {
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        userService.deleteUser(userDetails.getUsername());
        return "redirect:/logout";
    }
}