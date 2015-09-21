package org.kearis.formation.javaee7.chapitre1.ex34;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

public class Customer34 {

  // ======================================
  // =             Attributes             =
  // ======================================

  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private String phoneNumber;
  private Address34 address;

  // ======================================
  // =            Constructors            =
  // ======================================

  public Customer34() {
  }

  public Customer34(String firstName, String lastName, String email, String phoneNumber) {
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

  public Address34 getAddress() {
    return address;
  }

  public void setAddress(Address34 address) {
    this.address = address;
  }
}