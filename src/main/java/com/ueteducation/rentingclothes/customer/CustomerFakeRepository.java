package com.ueteducation.rentingclothes.customer;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

public class CustomerFakeRepository implements CustomerRepo
{
    @Override
    public List<Customer> getAllCustomers() {
        return Arrays.asList(
                new Customer(1L, "John", "123"),
                new Customer(2L, "Mary", "123")
        );
    }
}
