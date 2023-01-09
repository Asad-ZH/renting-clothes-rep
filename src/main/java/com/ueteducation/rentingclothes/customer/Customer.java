package com.ueteducation.rentingclothes.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
    private Long id;
    private String name;

    private String password;

    public Customer(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
    public String getName() {
        return name;
    }

    @JsonProperty("customer_id")
    public Long getId() {
        return id;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    @Override
    public String toString(){
        return "Customer" + "id=" + id + ", name='" + name + '\'' + ", password='" + password + '\'' + '}';
    }

}
