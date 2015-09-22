package org.kearis.formation.javaee7.chapitre1_1.ex24;

import javax.persistence.*;

public class Customer24 {

    public static final String FIND_ALL = "Customer.findAll";

    // ======================================
    // =             Attributes             =
    // ======================================

    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String email;
    private Address24 address;

    // ======================================
    // =            Constructors            =
    // ======================================

    public Customer24() {
    }

    public Customer24(String firstName, String lastName, String email, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    // ======================================
    // =          Getters & Setters         =
    // ======================================

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address24 getAddress() {
        return address;
    }

    public void setAddress(Address24 address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}