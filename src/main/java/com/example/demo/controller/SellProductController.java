package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.ProductService;

@Controller
public class SellProductController {
    @Autowired
    private ProductService productService;
    
    @GetMapping("/sell")
    public String sellPage() {
        return "sell"; // Page to enter product details
    }

    @PostMapping("/sell")
    public String sellProduct(@RequestParam String name, @RequestParam String description, 
                              @RequestParam Double price, @RequestParam Long userId,@RequestParam String contactNumber) {
        productService.createProduct(name, description, price, userId,contactNumber);
        return "redirect:/home"; // Redirect to home page after selling
    }
}
