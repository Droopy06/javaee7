package org.kearis.formation.javaee7.chapitre1.ex34;

import org.kearis.formation.javaee7.chapitre1.AbstractPersistentTest;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class Customer34IT extends AbstractPersistentTest {

  // ======================================
  // =              Unit tests            =
  // ======================================

  @Test
  public void shouldCreateACustomerWithOneAddress() throws Exception {

    Customer34 customer = new Customer34("John", "Smith", "jsmith@gmail.com", "1234565");
    Address34 address = new Address34("65B Ritherdon Rd", "At James place", "London", "LDN", "7QE554", "UK");
    customer.setAddress(address);
    tx.begin();
    em.persist(customer);
    em.persist(address);
    tx.commit();
    assertNotNull("ID should not be null", customer.getId());

    customer = em.find(Customer34.class, customer.getId());
    assertNotNull("Address should not be null", customer.getAddress());
  }
}