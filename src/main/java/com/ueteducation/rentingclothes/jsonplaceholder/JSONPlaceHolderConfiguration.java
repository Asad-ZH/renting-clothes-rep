package com.ueteducation.rentingclothes.jsonplaceholder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JSONPlaceHolderConfiguration {

    @Bean("jsonPlaceHolderCommandLineRunner")
    CommandLineRunner commandLineRunner(JSONPlaceHolderClient jsonPlaceHolderClient) {
        return args -> {
            System.out.println("https://jsonplaceholder.typicode.com/");
            System.out.println(jsonPlaceHolderClient.getPosts().size());
            System.out.println(jsonPlaceHolderClient.getPostById(1));
        };
    }
}
