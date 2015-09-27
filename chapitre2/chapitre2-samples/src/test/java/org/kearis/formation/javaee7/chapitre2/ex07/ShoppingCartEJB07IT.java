package org.kearis.formation.javaee7.chapitre2.ex07;

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

import static org.junit.Assert.*;

public class ShoppingCartEJB07IT extends AbstractEJBTest {

  // ======================================
  // =              Unit tests            =
  // ======================================

  @Test
  public void shouldAddTwoItemsToTheShoppingCart() throws Exception {

    Object ejb = ctx.lookup("java:global/chapitre2-samples-1.0.0-SNAPSHOT/ShoppingCartEJB07");
    assertNotNull(ejb);

    // Looks up the EJB
    ShoppingCartEJBRemote07 shoppingCartEJB = (ShoppingCartEJBRemote07) PortableRemoteObject.narrow(ejb, ShoppingCartEJBRemote07.class);

    // Checks the shopping cart is empty
    assertEquals("Cart should have no items", new Integer(0), shoppingCartEJB.getNumberOfItems());
    assertEquals("Total price should be zero", new Float(0), shoppingCartEJB.getTotal());

    // Creates an instance of book
    Item07 book = new Item07();
    book.setTitle("The Hitchhiker's Guide to the Galaxy");
    book.setPrice(12.5F);
    book.setDescription("Science fiction comedy book");

    // Adds the book to the shopping cart
    shoppingCartEJB.addItem(book);
    assertEquals("Cart should have one item", new Integer(1), shoppingCartEJB.getNumberOfItems());
    assertEquals("Total price should be 12.5F", new Float(12.5), shoppingCartEJB.getTotal());

    Item07 cd = new Item07();
    cd.setTitle("Zoot Allure");
    cd.setPrice(23f);
    cd.setDescription("Another Zappa's master piece");

    // Adds the cd to the shopping cart
    shoppingCartEJB.addItem(cd);
    assertEquals("Cart should have two items", new Integer(2), shoppingCartEJB.getNumberOfItems());
    assertEquals("Total price should be 35.5F", new Float(35.5), shoppingCartEJB.getTotal());

    // Empties the shopping cart
    shoppingCartEJB.empty();
    assertEquals("Cart should have no items", new Integer(0), shoppingCartEJB.getNumberOfItems());
    assertEquals("Total price should be zero", new Float(0), shoppingCartEJB.getTotal());

    // Checks out the shopping cart
    shoppingCartEJB.checkout();
    try {
      shoppingCartEJB.getNumberOfItems();
      fail("The checkout method has a @Remove annotation that clears the EJB. From here the EJB does not exist anymore");
    } catch (Exception e) {
    }
  }
}
