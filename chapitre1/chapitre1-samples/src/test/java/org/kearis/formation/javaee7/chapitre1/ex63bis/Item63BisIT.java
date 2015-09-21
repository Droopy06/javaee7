package org.kearis.formation.javaee7.chapitre1.ex63bis;

import org.kearis.formation.javaee7.chapitre1.AbstractPersistentTest;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class Item63BisIT extends AbstractPersistentTest {

  // ======================================
  // =              Unit tests            =
  // ======================================
  @Test
  public void shouldCreateABook() throws Exception {

    Book63Bis book = new Book63Bis("H2G2", 21f, "Best IT book", "123-456-789", "Pinguin", 321, false);
    tx.begin();
    em.persist(book);
    tx.commit();
    assertNotNull("Book ID should not be null", book.getId());
  }
}