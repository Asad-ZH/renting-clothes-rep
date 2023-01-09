package com.ueteducation.rentingclothes.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private final CustomerRepo customerRepo;

    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    List<Customer> getAllCustomer() {
        return customerRepo.getAllCustomers();
    }

    Customer getCustomer(Long id) {
        return getAllCustomer()
                .stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst()
                .orElseThrow(()-> new IllegalStateException("cusotmer not found"));
    }
}
