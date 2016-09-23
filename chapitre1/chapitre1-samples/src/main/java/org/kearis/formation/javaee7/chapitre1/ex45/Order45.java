package org.kearis.formation.javaee7.chapitre1.ex45;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
public class Order45 {

  // ======================================
  // =             Attributes             =
  // ======================================
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @Temporal(TemporalType.DATE)
  private Date creationDate;
  @OneToMany(fetch = FetchType.EAGER)
  @JoinColumn(name = "orderline45_id")
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