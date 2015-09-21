package org.kearis.formation.javaee7.chapitre1.ex66;

import org.kearis.formation.javaee7.chapitre1.AbstractPersistentTest;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class Item66IT extends AbstractPersistentTest {

  // ======================================
  // =              Unit tests            =
  // ======================================
  @Test
  public void shouldCreateABook() throws Exception {

    Book66 book = new Book66("H2G2", 21f, "Best IT book", "123-456-789", "Pinguin", 321, false);
    tx.begin();
    em.persist(book);
    tx.commit();
    assertNotNull("Book ID should not be null", book.getId());
  }
}