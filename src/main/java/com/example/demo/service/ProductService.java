package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ProductRepository; // Corrected the typo here
import com.example.demo.model.Product;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product createProduct(String name, String description, Double price, Long userId, String contact) {
        Product product = new Product(name, description, price, userId, contact);
        return productRepository.save(product);
    }
}
