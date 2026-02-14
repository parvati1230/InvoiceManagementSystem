package com.example.invoicemanagement.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.invoicemanagement.entity.InvoiceItem;
import com.example.invoicemanagement.exception.ResourceNotFoundException;
import com.example.invoicemanagement.repository.InvoiceItemRepository;
import com.example.invoicemanagement.service.InvoiceItemService;

@Service
public class InvoiceItemServiceImpl implements InvoiceItemService {

    @Autowired
    private InvoiceItemRepository repo;

    @Override
    public InvoiceItem saveInvoiceItem(InvoiceItem item) {
        return repo.save(item);
    }

    @Override
    public List<InvoiceItem> getAllInvoiceItems() {
        return repo.findAll();
    }

    @Override
    public InvoiceItem getInvoiceItemById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("InvoiceItem not found with id: " + id));
    }

    @Override
    public void deleteInvoiceItem(Long id) {
        repo.delete(getInvoiceItemById(id));
    }
}
