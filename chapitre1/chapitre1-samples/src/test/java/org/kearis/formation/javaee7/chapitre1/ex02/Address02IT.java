package org.kearis.formation.javaee7.chapitre1.ex02;

import org.kearis.formation.javaee7.chapitre1.AbstractPersistentTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Address02IT extends AbstractPersistentTest {

  // ======================================
  // =              Unit tests            =
  // ======================================

  @Test
  public void shouldCreateAnAddress() throws Exception {

    Address02 address = new Address02(getRandomId(), "65B Ritherdon Rd", "At James place", "London", "LDN", "7QE554", "UK");
    tx.begin();
    em.persist(address);
    tx.commit();
    Address02 found = em.find(Address02.class, address.getId());
    assertNotNull("ID should not be null", address.getId());
    assertEquals("City should be the same", found.getCity(), address.getCity());
    assertEquals("Country should be the same", found.getCountry(), address.getCountry());
    assertEquals("State should be the same", found.getState(), address.getState());
    assertEquals("Street1 should be the same", found.getStreet1(), address.getStreet1());
  }
}