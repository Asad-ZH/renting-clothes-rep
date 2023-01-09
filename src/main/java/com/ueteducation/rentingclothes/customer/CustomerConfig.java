package com.ueteducation.rentingclothes.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {

//    @Value("${app.useFakeCustomerRepo:true}")
//    private Boolean useFakeCustomerRepo;

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println("command line runner");
        };
    }

//    @Bean
//    CustomerRepo customerRepo() {
//        return useFakeCustomerRepo ? new CustomerFakeRepository() : new CustomerRepository();
//    }
}
