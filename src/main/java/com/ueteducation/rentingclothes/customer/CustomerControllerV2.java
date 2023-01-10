package com.ueteducation.rentingclothes.customer;

import com.ueteducation.rentingclothes.exception.ApiRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @GetMapping(path = "{customerId}/exception")
    Customer getCustomerException(@PathVariable("customerId") Long id) {
        throw new ApiRequestException("ApiRequestexception for customer" + id);
    }

    @PostMapping
    void createNewCustomer(@Valid @RequestBody Customer customer) {
        System.out.println("create new customer" + customer);
    }

    @PutMapping
    void updateCustomer(@Valid @RequestBody Customer customer) {
        System.out.println("update customer" + customer);
    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@RequestParam Long id) {
        System.out.println("delete customer with id: " + id);
    }

}
