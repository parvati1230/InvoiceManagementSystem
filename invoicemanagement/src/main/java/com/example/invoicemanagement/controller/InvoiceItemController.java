package com.example.invoicemanagement.controller;

  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.invoicemanagement.entity.InvoiceItem;
import com.example.invoicemanagement.service.InvoiceItemService;

@RestController
@RequestMapping("/api/invoiceitems")
public class InvoiceItemController {

    @Autowired
    private InvoiceItemService service;

    @PostMapping
    public InvoiceItem save(@RequestBody InvoiceItem item) {
        return service.saveInvoiceItem(item);
    }

    @GetMapping
    public List<InvoiceItem> getAll() {
        return service.getAllInvoiceItems();
    }

    @GetMapping("/{id}")
    public InvoiceItem getById(@PathVariable Long id) {
        return service.getInvoiceItemById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteInvoiceItem(id);
        return "InvoiceItem deleted";
    }
}
