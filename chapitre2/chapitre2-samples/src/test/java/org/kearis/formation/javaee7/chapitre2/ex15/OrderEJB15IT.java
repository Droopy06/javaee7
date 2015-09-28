package org.kearis.formation.javaee7.chapitre2.ex15;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.kearis.formation.javaee7.chapitre2.AbstractEJBTest;
import org.kearis.formation.javaee7.chapitre2.ex01.BookEJBRemote01;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;
import java.io.File;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class OrderEJB15IT extends AbstractEJBTest {

  private OrderEJBRemote15 orderEJB;

  @Before
  public void init() throws NamingException {
    Object ejb = ctx.lookup("java:global/chapitre2-samples-1.0.0-SNAPSHOT/OrderEJB15");
    assertNotNull(ejb);

    // Looks up the EJB
     orderEJB = (OrderEJBRemote15) PortableRemoteObject.narrow(ejb, OrderEJBRemote15.class);

  }

  // ======================================
  // =              Unit tests            =
  // ======================================

  /**
   * Without the @Asynchronous annotation on the EJB, this test would timeout and fail
   */
  @Test(timeout = 100)
  public void shouldSendEmailOrderCompleteAsynchronously() throws Exception {

    System.out.println("[IT] Calling EJB ...");
    Calendar start = Calendar.getInstance();
    orderEJB.sendEmailOrderComplete(new Order15(), new Customer15());
    System.out.println("[IT] End of call " + (Calendar.getInstance().getTimeInMillis() - start.getTimeInMillis()) +"ms");
  }

}