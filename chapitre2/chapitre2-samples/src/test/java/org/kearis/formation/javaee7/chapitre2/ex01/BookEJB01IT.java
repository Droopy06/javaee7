package org.kearis.formation.javaee7.chapitre2.ex01;

import org.junit.Test;
import org.kearis.formation.javaee7.chapitre2.AbstractEJBTest;

import javax.rmi.PortableRemoteObject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BookEJB01IT extends AbstractEJBTest {



  // ======================================
  // =              Unit tests            =
  // ======================================

  @Test
  public void shouldCreateABook() throws Exception {

    // Creates an instance of book
    Book01 book = new Book01();
    book.setTitle("The Hitchhiker's Guide to the Galaxy");
    book.setPrice(12.5F);
    book.setDescription("Science fiction comedy book");
    book.setIsbn("1-84023-742-2");
    book.setNbOfPage(354);
    book.setIllustrations(false);

    Object ejb = ctx.lookup("java:global/chapitre2-samples-1.0.0-SNAPSHOT/BookEJB01");
    assertNotNull(ejb);

    // Looks up the EJB
    BookEJBRemote01 bookEJB = (BookEJBRemote01) PortableRemoteObject.narrow(ejb, BookEJBRemote01.class);

    // Persists the book to the database
    int oldSize = bookEJB.findBooks().size();
    book = bookEJB.createBook(book);
    assertNotNull("ID should not be null", book.getId());

    // Retrieves all the books from the database
    assertEquals(oldSize+1, bookEJB.findBooks().size());
  }
}