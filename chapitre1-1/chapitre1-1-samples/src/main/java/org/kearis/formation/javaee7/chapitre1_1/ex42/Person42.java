package org.kearis.formation.javaee7.chapitre1_1.ex42;

import javax.persistence.*;

public class Person42 {

    // ======================================
    // =             Attributes             =
    // ======================================
    private Long id;
    private String firstName;
    private String lastName;

// ======================================
// =            Constructors            =
// ======================================

    public Person42() {
    }

    public Person42(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
}