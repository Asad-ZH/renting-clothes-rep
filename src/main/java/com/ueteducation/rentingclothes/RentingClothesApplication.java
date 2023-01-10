package com.ueteducation.rentingclothes;

import com.ueteducation.rentingclothes.customer.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
public class RentingClothesApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentingClothesApplication.class, args);
    }
}
