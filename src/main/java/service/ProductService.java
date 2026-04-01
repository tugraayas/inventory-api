package com.tugra.inventory.service;

import com.tugra.inventory.model.Product;
import com.tugra.inventory.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product updated) {
        updated.setId(id);
        return productRepository.save(updated);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}