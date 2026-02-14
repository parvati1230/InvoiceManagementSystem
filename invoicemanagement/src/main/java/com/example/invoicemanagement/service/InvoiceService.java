package com.example.invoicemanagement.service;

import java.util.List;

import com.example.invoicemanagement.entity.Invoice;

public interface InvoiceService {

    Invoice createInvoice(Invoice invoice);

    List<Invoice> getAllInvoices();

    Invoice getInvoiceById(Long id);

    void deleteInvoice(Long id);
}
