package org.kearis.formation.javaee7.chapitre1.ex20;

import org.kearis.formation.javaee7.chapitre1.AbstractPersistentTest;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class Customer20IT extends AbstractPersistentTest {

  // ======================================
  // =              Unit tests            =
  // ======================================

  @Test
  public void shouldCreateACustomer() throws Exception {

    Customer20 customer = new Customer20("John", "Smith", "jsmith@gmail.com", "1234565");
    tx.begin();
    em.persist(customer);
    tx.commit();
    Customer20 found = em.find(Customer20.class, customer.getId());
    assertNotNull("ID should not be null", found.getId());
    assertNotNull("PhoneNumber should not be null", found.getPhoneNumber());
  }
}