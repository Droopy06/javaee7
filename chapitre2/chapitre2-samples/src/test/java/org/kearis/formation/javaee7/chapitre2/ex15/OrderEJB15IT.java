package org.kearis.formation.javaee7.chapitre2.ex15;

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
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class OrderEJB15IT extends AbstractEJBTest {

  // ======================================
  // =             Attributes             =
  // ======================================

  private static OrderEJBRemote15 orderEJB;

  // ======================================
  // =          Lifecycle Methods         =
  // ======================================

  @BeforeClass
  public static void initContainer() throws Exception {


    Object ejb = ctx.lookup("java:global/chapitre2-samples-1.0.0-SNAPSHOT/OrderEJB15");
    assertNotNull(ejb);

    // Looks up the EJB
    orderEJB = (OrderEJBRemote15) PortableRemoteObject.narrow(ejb, OrderEJBRemote15.class);

  }


  // ======================================
  // =              Unit tests            =
  // ======================================

  /**
   * Without the @Asynchronous annotation on the EJB, this tes would timeout and fail
   */
  @Test(timeout = 500)
  public void shouldSendEmailOrderCompleteAsynchronously() throws Exception {
    orderEJB.sendEmailOrderComplete(new Order15(), new Customer15());
  }

  /**
   * Without the @Asynchronous annotation on the EJB, this tes would timeout and fail
   */
  @Test(timeout = 500)
  public void shouldPrintOrderAsynchronously() throws Exception {
    orderEJB.printOrder(new Order15());
  }

  @Test
  public void shouldSendOrderToWorkflow() throws ExecutionException, InterruptedException {
    // when
    Future<Integer> status = orderEJB.sendOrderToWorkflow(new Order15());

    // then
    assertEquals((Object) 1, status.get());
  }
}