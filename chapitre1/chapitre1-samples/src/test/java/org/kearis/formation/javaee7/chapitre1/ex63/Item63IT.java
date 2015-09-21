package org.kearis.formation.javaee7.chapitre1.ex63;

import org.kearis.formation.javaee7.chapitre1.AbstractPersistentTest;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class Item63IT extends AbstractPersistentTest {

  // ======================================
  // =              Unit tests            =
  // ======================================
  @Test
  public void shouldCreateABook() throws Exception {

    Book63 book = new Book63("H2G2", 21f, "Best IT book", "123-456-789", "Pinguin", 321, false);
    tx.begin();
    em.persist(book);
    tx.commit();
    assertNotNull("Book ID should not be null", book.getId());
  }
}