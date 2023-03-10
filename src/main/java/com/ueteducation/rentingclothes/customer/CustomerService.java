package com.ueteducation.rentingclothes.customer;

import com.ueteducation.rentingclothes.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    Customer getCustomer(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(()-> new NotFoundException("cusotmer not found"));
    }
}
