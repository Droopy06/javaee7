package org.kearis.formation.javaee7.chapitre2.ex02;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.kearis.formation.javaee7.chapitre2.AbstractEJBTest;
import org.kearis.formation.javaee7.chapitre2.ex05.ItemEJBRemote05;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.rmi.PortableRemoteObject;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertNotNull;

public class ItemEJB02IT extends AbstractEJBTest {


  // ======================================
  // =              Unit tests            =
  // ======================================

  @Test
  public void shouldCreateAnItem() throws Exception {

    // Creates an instance of book
    Book02 book = new Book02();
    book.setTitle("The Hitchhiker's Guide to the Galaxy");
    book.setPrice(12.5F);
    book.setDescription("Science fiction comedy book");
    book.setIsbn("1-84023-742-2");
    book.setNbOfPage(354);
    book.setIllustrations(false);

    Object ejb = ctx.lookup("java:global/chapitre2-samples-1.0.0-SNAPSHOT/ItemEJB02");
    assertNotNull(ejb);

    // Looks up the EJB
    ItemRemote02 itemEJB = (ItemRemote02) PortableRemoteObject.narrow(ejb, ItemRemote02.class);


    // Persists the book to the database
    book = itemEJB.createBook(book);
    assertNotNull("Book should not be null", book);

    // Retrieves all the books from the database
    assertNotNull(itemEJB.findBooks());


    // Looks up the EJB with the local interface
    ItemLocal02 itemLocal = (ItemLocal02) ctx.lookup("java:global/classes/ItemEJB02!org.kearis.formation.javaee7.chapitre2.ex02.ItemLocal02");

    // Retrieves all the books from the database
    assertNotNull(itemLocal.findBooks());


    // Looks up the EJB with the remote interface
    ItemRemote02 itemRemote = (ItemRemote02) ctx.lookup("java:global/classes/ItemEJB02!org.kearis.formation.javaee7.chapitre2.ex02.ItemRemote02");

    // Persists the book to the database
    book.setId(null);
    book = itemRemote.createBook(book);
    assertNotNull("Book should not be null", book);

    // Retrieves all the books from the database
    assertNotNull(itemRemote.findBooks());
  }
}