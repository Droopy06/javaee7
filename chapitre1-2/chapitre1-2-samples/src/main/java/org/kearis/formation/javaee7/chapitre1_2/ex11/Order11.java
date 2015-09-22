package org.kearis.formation.javaee7.chapitre1_2.ex11;

import javax.validation.constraints.Pattern;
import java.util.Date;

public class Order11 {

  // ======================================
  // =             Attributes             =
  // ======================================

//  regex
  private String orderId;
  private Date creationDate;
  private Double totalAmount;
  private Date paymentDate;
  private Date deliveryDate;

  // ======================================
  // =            Constructors            =
  // ======================================

  public Order11() {
  }

  // ======================================
  // =          Getters & Setters         =
  // ======================================

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  public Double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public Date getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(Date paymentDate) {
    this.paymentDate = paymentDate;
  }

  public Date getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(Date deliveryDate) {
    this.deliveryDate = deliveryDate;
  }
}