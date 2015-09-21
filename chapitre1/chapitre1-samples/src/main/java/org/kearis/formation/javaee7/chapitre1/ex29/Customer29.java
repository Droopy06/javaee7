package org.kearis.formation.javaee7.chapitre1.ex29;

import javax.persistence.*;

public class Customer29 {

  // ======================================
  // =             Attributes             =
  // ======================================

  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private String phoneNumber;
  private Address29 address;

  // ======================================
  // =            Constructors            =
  // ======================================

  public Customer29() {
  }

  public Customer29(String firstName, String lastName, String email, String phoneNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phoneNumber = phoneNumber;
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

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Address29 getAddress() {
    return address;
  }

  public void setAddress(Address29 address) {
    this.address = address;
  }
}