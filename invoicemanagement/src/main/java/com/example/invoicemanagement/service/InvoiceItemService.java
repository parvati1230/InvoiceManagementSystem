package com.example.invoicemanagement.service;



import java.util.List;

import com.example.invoicemanagement.entity.InvoiceItem;

public interface InvoiceItemService {

    InvoiceItem saveInvoiceItem(InvoiceItem item);

    List<InvoiceItem> getAllInvoiceItems();

    InvoiceItem getInvoiceItemById(Long id);

    void deleteInvoiceItem(Long id);
}

