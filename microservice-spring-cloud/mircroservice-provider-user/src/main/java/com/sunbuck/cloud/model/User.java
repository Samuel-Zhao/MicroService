package com.sunbuck.cloud.model;

import org.hibernate.annotations.ValueGenerationType;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.persistence.*;


/**
 * Created by Sunbuck on 2017/4/24.
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Long id;
    @Column
    private String username;
    @Column
    private String name;
    @Column
    private int age;
    @Column
    private float   balance;

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

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
