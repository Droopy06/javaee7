package org.kearis.formation.javaee7.chapitre1.ex14;

import org.kearis.formation.javaee7.chapitre1.AbstractPersistentTest;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

public class Customer14IT extends AbstractPersistentTest {

  // ======================================
  // =              Unit tests            =
  // ======================================
  @Test
  public void shoulCreateACustomer() throws Exception {

    Customer14 customer = new Customer14("John", "Smith", "jsmith@gmail.com", "1234565", new Date(), new Date());
    tx.begin();
    em.persist(customer);
    tx.commit();
    assertNotNull("ID should not be null", customer.getId());
    assertNotNull("CreationDate should not be null", customer.getCreationDate());
    assertNotNull("DateOfBirth should not be null", customer.getDateOfBirth());
  }
}