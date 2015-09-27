package org.kearis.formation.javaee7.chapitre2.ex17;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.kearis.formation.javaee7.chapitre2.AbstractEJBTest;
import org.kearis.formation.javaee7.chapitre2.ex01.BookEJBRemote01;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ItemEJB17IT extends AbstractEJBTest {


  // ======================================
  // =              Unit tests            =
  // ======================================

  @Test
  public void shouldCreateAnItem() throws Exception {

    try {
        ctx.lookup("java:global/chapitre2-samples-1.0.0-SNAPSHOT/ItemEJB17");
        fail("Should thrown NamingException");
    } catch (Exception e) {
         assertTrue(e instanceof NamingException);
    }

  }
}