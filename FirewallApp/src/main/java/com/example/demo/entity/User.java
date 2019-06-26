package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private long id;
    private String name;
    private String email;
    public User() {}

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", email=" + email + '}';
    }
}