package org.kearis.formation.javaee7.chapitre1_1.ex42;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.ExcludeSuperclassListeners;
import javax.persistence.Transient;

public class Customer42 extends Person42 {

    // ======================================
    // =             Attributes             =
    // ======================================
    private String email;
    private String phoneNumber;
    private Integer age;

    // ======================================
    // =            Constructors            =
    // ======================================

    public Customer42() {
    }

    public Customer42(String firstName, String lastName, String email, String phoneNumber) {
        super(firstName, lastName);
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // ======================================
    // =          Getters & Setters         =
    // ======================================

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}