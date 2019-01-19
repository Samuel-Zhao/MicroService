package com.itmuch.cloud.entity;

import java.io.Serializable;

/**
 * Created by Samuel on 2017/7/5.
 */
public class User implements Serializable{
    private Long id;
    private String username;
    private String name;
    private int age;
    private float balance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
