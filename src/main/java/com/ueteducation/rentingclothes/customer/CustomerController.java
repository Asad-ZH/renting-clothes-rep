package com.ueteducation.rentingclothes.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Deprecated
@RestController
@RequestMapping(path = "api/v1/customer")
class CustomerController {
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("all")
    List<Customer> gerCustomer() {
        return customerService.getAllCustomer();
    }

    @PostMapping
    void createNewCustomer(@RequestBody Customer customer) {
        System.out.println("create new customer" + customer);
    }

    @PutMapping
    void updateCustomer(@RequestBody Customer customer) {
        System.out.println("update customer" + customer);
    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@RequestParam Long id) {
        System.out.println("delete customer with id: " + id);
    }

}
