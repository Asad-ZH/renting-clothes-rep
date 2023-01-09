package com.ueteducation.rentingclothes.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v2/customer")
class CustomerControllerV2 {
    private CustomerService customerService;

    @Autowired
    public CustomerControllerV2(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getAllCustomer() {
        return customerService.getAllCustomer();
    }
    @GetMapping(path = "{customerId}")
    Customer getCustomer(@PathVariable("customerId") Long id) {
        return customerService.getCustomer(id);
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
