package org.kearis.formation.javaee7.chapitre2.ex18;

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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ItemEJB18IT extends AbstractEJBTest {

  // ======================================
  // =              Unit tests            =
  // ======================================

  @Test
  public void shouldConvertTheFixedPriceOfAnItem() throws Exception {

    // Creates an instance of an item
    Item18 item = new Item18();
    item.setTitle("The Hitchhiker's Guide to the Galaxy");
    item.setPrice(12.5F);
    item.setIsbn("1-84023-742-2");
    item.setNbOfPage(354);
    item.setIllustrations(false);

    Object ejb = ctx.lookup("java:global/chapitre2-samples-1.0.0-SNAPSHOT/ItemEJB18");
    assertNotNull(ejb);

    // Looks up the EJB
    ItemEJBRemote18 itemEJB = (ItemEJBRemote18) PortableRemoteObject.narrow(ejb, ItemEJBRemote18.class);

    // Persists the book to the database
    item = itemEJB.convertFixedPrice(item);
    assertEquals("The currency should be euros", "Euros", item.getCurrency());
    assertEquals("Price should be 12.5 * 0.8", new Float(10), item.getPrice());
  }

  @Test
  public void shouldConvertThePriceOfAnItem() throws Exception {

    // Creates an instance of an item
    Item18 item = new Item18();
    item.setTitle("The Hitchhiker's Guide to the Galaxy");
    item.setPrice(12.5F);
    item.setIsbn("1-84023-742-2");
    item.setNbOfPage(354);
    item.setIllustrations(false);

    Object ejb = ctx.lookup("java:global/chapitre2-samples-1.0.0-SNAPSHOT/ItemEJB18");
    assertNotNull(ejb);

    // Looks up the EJB
    ItemEJBRemote18 itemEJB = (ItemEJBRemote18) PortableRemoteObject.narrow(ejb, ItemEJBRemote18.class);

    // Persists the book to the database
    item = itemEJB.convertPrice(item);
    assertEquals("The currency should be dollars from the ejb-jar.xml", "Dollars", item.getCurrency());
    assertEquals("Price should be 12.5 * 0.9", new Float(11.25), item.getPrice());
  }
}