package org.kearis.formation.javaee7.chapitre1.ex17;

import org.kearis.formation.javaee7.chapitre1.AbstractPersistentTest;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CreditCard17IT extends AbstractPersistentTest {

  // ======================================
  // =              Unit tests            =
  // ======================================
  @Test
  public void shouldCreateACreditCard() throws Exception {

    CreditCard17 creditCard = new CreditCard17("123412341234", "12/12", 1253, CreditCardType17.AMERICAN_EXPRESS);
    tx.begin();
    em.persist(creditCard);
    tx.commit();
    assertNotNull("ID should not be null", creditCard.getNumber());
  }
}