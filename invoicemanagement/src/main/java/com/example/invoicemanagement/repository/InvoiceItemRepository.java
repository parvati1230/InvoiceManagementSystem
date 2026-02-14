package com.example.invoicemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.invoicemanagement.entity.InvoiceItem;

public interface InvoiceItemRepository extends JpaRepository<InvoiceItem, Long> {}
