package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

import org.springframework.ui.Model;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password, Model model) {
        Optional<User> user = userService.findUserByEmail(email);
        if (user.isPresent() && user.get().getPassword().equals(password)) {
            return "redirect:/home"; // Redirect to home page after successful login
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "login"; // Stay on login page if credentials are invalid
        }
    }

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @PostMapping("/register")
    public String register(@RequestParam String name, @RequestParam String email, @RequestParam String password) {
        userService.registerUser(name, email, password);
        return "redirect:/login"; // Redirect to login page after successful registration
    }
}

