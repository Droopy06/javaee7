package org.kearis.formation.javaee7.chapitre1.ex43;

import javax.persistence.*;

@Entity
@Table(name = "orderline43")
public class OrderLine43 {

  // ======================================
  // =             Attributes             =
  // ======================================
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String item;
  private Double unitPrice;
  @Transient
  private Integer quantity;

  // ======================================
  // =            Constructors            =
  // ======================================

  public OrderLine43() {
  }

  public OrderLine43(String item, Double unitPrice, Integer quantity) {
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