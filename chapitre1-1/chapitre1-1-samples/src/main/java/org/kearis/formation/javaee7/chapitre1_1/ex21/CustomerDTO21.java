package org.kearis.formation.javaee7.chapitre1_1.ex21;

public class CustomerDTO21 {

  // ======================================
  // =             Attributes             =
  // ======================================

  private String firstName;
  private String lastName;
  private String country;

  // ======================================
  // =            Constructors            =
  // ======================================

  public CustomerDTO21() {
  }

  public CustomerDTO21(String firstName, String lastName, String country) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.country = country;
  }

  // ======================================
  // =          Getters & Setters         =
  // ======================================

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

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }
}