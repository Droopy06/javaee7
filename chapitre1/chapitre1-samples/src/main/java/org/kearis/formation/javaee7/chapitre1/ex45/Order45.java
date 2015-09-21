package org.kearis.formation.javaee7.chapitre1.ex45;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

public class Order45 {

  // ======================================
  // =             Attributes             =
  // ======================================

  private Long id;
  private Date creationDate;
  private List<OrderLine45> orderLines;

  // ======================================
  // =            Constructors            =
  // ======================================

  public Order45() {
    this.creationDate = new Date();
  }

  // ======================================
  // =          Getters & Setters         =
  // ======================================

  public Long getId() {
    return id;
  }

  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  public List<OrderLine45> getOrderLines() {
    return orderLines;
  }

  public void setOrderLines(List<OrderLine45> orderLines) {
    this.orderLines = orderLines;
  }
}