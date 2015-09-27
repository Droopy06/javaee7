package org.kearis.formation.javaee7.chapitre2.ex05;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.kearis.formation.javaee7.chapitre2.AbstractEJBTest;
import org.kearis.formation.javaee7.chapitre2.ex01.BookEJBRemote01;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.rmi.PortableRemoteObject;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertNotNull;

public class ItemEJB05IT extends AbstractEJBTest {

  // ======================================
  // =              Unit tests            =
  // ======================================

  @Test
  public void shouldCreateABook() throws Exception {

    // Creates an instance of book
    Book05 book = new Book05();
    book.setTitle("The Hitchhiker's Guide to the Galaxy");
    book.setPrice(12.5F);
    book.setDescription("Science fiction comedy book");
    book.setIsbn("1-84023-742-2");
    book.setNbOfPage(354);
    book.setIllustrations(false);

    Object ejb = ctx.lookup("java:global/chapitre2-samples-1.0.0-SNAPSHOT/ItemEJB05");
    assertNotNull(ejb);

    // Looks up the EJB
    ItemEJBRemote05 bookEJB = (ItemEJBRemote05) PortableRemoteObject.narrow(ejb, ItemEJBRemote05.class);

    // Persists the book to the database
    book = bookEJB.createBook(book);
    assertNotNull("ID should not be null", book.getId());

    // Retrieves all the books from the database
    assertNotNull(bookEJB.findBooks());
  }
}