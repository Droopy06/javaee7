package org.kearis.formation.javaee7.chapitre1.ex40;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

public class Order40 {

  // ======================================
  // =             Attributes             =
  // ======================================

  private Long id;
  private Date creationDate;
  private List<OrderLine40> orderLines;

  // ======================================
  // =            Constructors            =
  // ======================================

  public Order40() {
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

  public List<OrderLine40> getOrderLines() {
    return orderLines;
  }

  public void setOrderLines(List<OrderLine40> orderLines) {
    this.orderLines = orderLines;
  }
}