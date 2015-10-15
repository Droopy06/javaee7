package org.kearis.formation.javaee7.chapitre3.ex07;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlSeeAlso(Customer07.class)
public class Customers07 extends ArrayList<Customer07> {

  // ======================================
  // =          Getters & Setters         =
  // ======================================

  @XmlElement(name = "customer")
  public List<Customer07> getCustomers() {
    return this;
  }
}