package org.kearis.formation.javaee7.chapitre1.ex32;

import org.kearis.formation.javaee7.chapitre1.AbstractPersistentTest;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class Customer32IT extends AbstractPersistentTest {

  // ======================================
  // =              Unit tests            =
  // ======================================
  @Test
  public void shouldCreateACustomerWithAnEmbeddedAddress() throws Exception {

    Customer32 customer = new Customer32("John", "Smith", "jsmith@gmail.com", "1234565");
    Address32 address = new Address32("65B Ritherdon Rd", "At James place", "London", "LDN", "7QE554", "UK");
    customer.setAddress(address);
    tx.begin();
    em.persist(customer);
    tx.commit();
    assertNotNull("ID should not be null", customer.getId());
  }
}