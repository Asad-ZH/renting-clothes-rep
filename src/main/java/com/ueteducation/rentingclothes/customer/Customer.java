package com.ueteducation.rentingclothes.customer;

public class Customer {
    private Long id;
    private String name;

    public Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
