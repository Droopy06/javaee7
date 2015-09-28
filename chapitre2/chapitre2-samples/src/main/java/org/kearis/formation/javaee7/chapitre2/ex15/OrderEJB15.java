package org.kearis.formation.javaee7.chapitre2.ex15;

import javax.annotation.Resource;
import javax.ejb.*;
import java.util.Calendar;
import java.util.concurrent.Future;

@Stateless
@Remote
public class OrderEJB15 implements OrderEJBRemote15 {

  // ======================================
  // =             Attributes             =
  // ======================================

  @Resource
  private SessionContext ctx;

  // ======================================
  // =           Public Methods           =
  // ======================================

  @Override
  public void sendEmailOrderComplete(Order15 order, Customer15 customer) {
    // Very Long task
    System.out.println("[EJB] Sending email ...");
    Calendar start = Calendar.getInstance();
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("[EJB] Email was sent !" + (Calendar.getInstance().getTimeInMillis() - start.getTimeInMillis()) +"ms");
  }


}