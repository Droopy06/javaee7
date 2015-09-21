package org.kearis.formation.javaee7.chapitre1.ex45;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

public class OrderLine45 {

  // ======================================
  // =             Attributes             =
  // ======================================

  private Long id;
  private String item;
  private Double unitPrice;
  private Integer quantity;

  // ======================================
  // =            Constructors            =
  // ======================================

  public OrderLine45() {
  }

  public OrderLine45(String item, Double unitPrice, Integer quantity) {
    this.item = item;
    this.unitPrice = unitPrice;
    this.quantity = quantity;
  }

  // ======================================
  // =          Getters & Setters         =
  // ======================================

  public Long getId() {
    return id;
  }

  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public Double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }
}