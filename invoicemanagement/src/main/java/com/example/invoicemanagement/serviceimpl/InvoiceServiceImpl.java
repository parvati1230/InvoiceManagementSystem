package com.example.invoicemanagement.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.invoicemanagement.entity.Invoice;
import com.example.invoicemanagement.exception.ResourceNotFoundException;
import com.example.invoicemanagement.repository.InvoiceRepository;
import com.example.invoicemanagement.service.InvoiceService;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceRepository repo;

    @Override
    public Invoice createInvoice(Invoice invoice) {
        return repo.save(invoice);
    }

    @Override
    public List<Invoice> getAllInvoices() {
        return repo.findAll();
    }

    @Override
    public Invoice getInvoiceById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Invoice not found with id: " + id));
    }

    @Override
    public void deleteInvoice(Long id) {
        repo.delete(getInvoiceById(id));
    }
}
