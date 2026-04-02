package com.tugra.inventory.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Product name cannot be empty")
    private String name;

    @NotBlank(message = "Category cannot be empty")
    private String category;

    @Min(value = 0, message = "Quantity cannot be negative")
    private int quantity;

    @Min(value = 0, message = "Price cannot be negative")
    private double price;
}