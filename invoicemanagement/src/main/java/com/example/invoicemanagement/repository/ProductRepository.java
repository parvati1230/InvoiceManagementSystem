package com.example.invoicemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.invoicemanagement.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}
