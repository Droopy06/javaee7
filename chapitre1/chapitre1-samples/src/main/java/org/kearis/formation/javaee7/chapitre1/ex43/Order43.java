package org.kearis.formation.javaee7.chapitre1.ex43;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
public class Order43 {

  // ======================================
  // =             Attributes             =
  // ======================================
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @Temporal(TemporalType.DATE)
  private Date creationDate;
  @OneToMany(fetch = FetchType.EAGER)
  @JoinColumn(name = "orderline43_id")
  private List<OrderLine43> orderLines;

  // ======================================
  // =            Constructors            =
  // ======================================

  public Order43() {
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

  public List<OrderLine43> getOrderLines() {
    return orderLines;
  }

  public void setOrderLines(List<OrderLine43> orderLines) {
    this.orderLines = orderLines;
  }
}