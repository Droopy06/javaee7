package org.kearis.formation.javaee7.chapitre1.ex01;

import org.kearis.formation.javaee7.chapitre1.AbstractPersistentTest;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class Book01IT extends AbstractPersistentTest {

  // ======================================
  // =              Unit tests            =
  // ======================================
  @Test
  public void shouldCreateABook() throws Exception {

    final Long id = getRandomId();
    Book01 book = new Book01(id, "The Hitchhiker's Guide to the Galaxy", 12.5F, "The Hitchhiker's Guide to the Galaxy is a science fiction comedy series created by Douglas Adams.", "1-84023-742-2", 354, false);
    assertNull("Book should not be found", em.find(Book01.class, book.getId()));
    tx.begin();
    em.persist(book);
    tx.commit();
    assertNotNull("Book should be found", em.find(Book01.class, id));
  }
}
