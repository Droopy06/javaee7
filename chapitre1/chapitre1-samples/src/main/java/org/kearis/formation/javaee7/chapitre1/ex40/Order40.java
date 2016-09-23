package org.kearis.formation.javaee7.chapitre1.ex40;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
public class Order40 {

  // ======================================
  // =             Attributes             =
  // ======================================
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @Temporal(TemporalType.DATE)
  private Date creationDate;
  @OneToMany(fetch = FetchType.EAGER)
  @JoinColumn(name = "orderline40_id")
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