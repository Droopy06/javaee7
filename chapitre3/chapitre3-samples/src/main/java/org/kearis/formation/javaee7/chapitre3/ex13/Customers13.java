package org.kearis.formation.javaee7.chapitre3.ex13;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlSeeAlso(Customer13.class)
public class Customers13 extends ArrayList<Customer13> {

  // ======================================
  // =          Getters & Setters         =
  // ======================================

  @XmlElement(name = "customer")
  public List<Customer13> getCustomers() {
    return this;
  }
}