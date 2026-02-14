package com.example.invoicemanagement.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.invoicemanagement.entity.Customer;
import com.example.invoicemanagement.exception.ResourceNotFoundException;
import com.example.invoicemanagement.repository.CustomerRepository;
import com.example.invoicemanagement.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository repo;

    @Override
    public Customer saveCustomer(Customer customer) {
        return repo.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return repo.findAll();
    }

    @Override
    public Customer getCustomerById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found with id: " + id));
    }

    @Override
    public Customer updateCustomer(Long id, Customer customer) {
        Customer existing = getCustomerById(id);

        existing.setCustomerName(customer.getCustomerName());
        existing.setEmail(customer.getEmail());
        existing.setPhoneNumber(customer.getPhoneNumber());
        existing.setAddress(customer.getAddress());

        return repo.save(existing);
    }

    @Override
    public void deleteCustomer(Long id) {
        repo.delete(getCustomerById(id));
    }
}
