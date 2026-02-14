package com.example.invoicemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.invoicemanagement.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
}
