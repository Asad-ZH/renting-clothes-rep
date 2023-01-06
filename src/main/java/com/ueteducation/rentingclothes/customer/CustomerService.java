package com.ueteducation.rentingclothes.customer;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    Customer gerCustomer() {
        return new Customer(1L, "john wick");
    }
}
