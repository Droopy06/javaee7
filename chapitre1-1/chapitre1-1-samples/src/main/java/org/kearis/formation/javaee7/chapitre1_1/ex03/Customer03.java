package org.kearis.formation.javaee7.chapitre1_1.ex03;

import javax.persistence.*;


public class Customer03 {

  // ======================================
  // =             Attributes             =
  // ======================================

  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private Address03 address;

  // ======================================
  // =            Constructors            =
  // ======================================

  public Customer03() {
  }

  public Customer03(String firstName, String lastName, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
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

  public Address03 getAddress() {
    return address;
  }

  public void setAddress(Address03 address) {
    this.address = address;
  }
}