package org.kearis.formation.javaee7.chapitre3.ex05;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlSeeAlso(Item05.class)
public class Items05 extends ArrayList<Item05> {

  // ======================================
  // =          Getters & Setters         =
  // ======================================

  @XmlElement(name = "item")
  public List<Item05> getItems() {
    return this;
  }
}