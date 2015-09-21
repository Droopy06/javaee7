package org.kearis.formation.javaee7.chapitre1.ex23;

import org.kearis.formation.javaee7.chapitre1.AbstractPersistentTest;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Book23IT extends AbstractPersistentTest {

  // ======================================
  // =              Unit tests            =
  // ======================================

  @Test
  public void shouldCreateABookWithTags() throws Exception {

    ArrayList<String> tags = new ArrayList<>();
    tags.add("scifi");
    tags.add("must have");
    tags.add("funny");
    Book23 book = new Book23("The Hitchhiker's Guide to the Galaxy", 12.5F, "The Hitchhiker's Guide to the Galaxy is a science fiction comedy series created by Douglas Adams.", "1-84023-742-2", 354, false, tags);
    tx.begin();
    em.persist(book);
    tx.commit();
    assertNotNull("ID should not be null", book.getId());
    assertEquals(3, book.getTags().size());
  }
}