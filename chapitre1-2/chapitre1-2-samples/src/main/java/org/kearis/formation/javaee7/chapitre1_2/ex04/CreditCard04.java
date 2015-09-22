package org.kearis.formation.javaee7.chapitre1_2.ex04;

import javax.validation.constraints.NotNull;

public class CreditCard04 {

  // ======================================
  // =             Attributes             =
  // ======================================

  private String number;
  private String expiryDate;
  private Integer controlNumber;
  private String type;

  // ======================================
  // =            Constructors            =
  // ======================================

  public CreditCard04() {
  }

  public CreditCard04(String number, String expiryDate, Integer controlNumber, String type) {
    this.number = number;
    this.expiryDate = expiryDate;
    this.controlNumber = controlNumber;
    this.type = type;
  }

  // ======================================
  // =          Getters & Setters         =
  // ======================================

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  public Integer getControlNumber() {
    return controlNumber;
  }

  public void setControlNumber(Integer controlNumber) {
    this.controlNumber = controlNumber;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}