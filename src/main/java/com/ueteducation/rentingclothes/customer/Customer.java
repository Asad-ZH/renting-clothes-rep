package com.ueteducation.rentingclothes.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class Customer {

    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @NotBlank
    @Email
    private String email;


    public Customer(Long id, String name, String password, String email) {

        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }
    public String getName() {
        return name;
    }

    @JsonProperty("customer_id")
    public Long getId() {
        return id;
    }

//    @JsonIgnore
    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
