package com.example.invoicemanagement.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.invoicemanagement.entity.Product;
import com.example.invoicemanagement.exception.ResourceNotFoundException;
import com.example.invoicemanagement.repository.ProductRepository;
import com.example.invoicemanagement.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repo;

    @Override
    public Product saveProduct(Product product) {
        return repo.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        Product existing = getProductById(id);

        existing.setProductName(product.getProductName());
        existing.setPrice(product.getPrice());
        existing.setDescription(product.getDescription());

        return repo.save(existing);
    }

    @Override
    public void deleteProduct(Long id) {
        repo.delete(getProductById(id));
    }
}
