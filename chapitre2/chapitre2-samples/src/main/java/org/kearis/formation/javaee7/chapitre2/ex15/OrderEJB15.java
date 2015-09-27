package org.kearis.formation.javaee7.chapitre2.ex15;

import javax.annotation.Resource;
import javax.ejb.AsyncResult;
import javax.ejb.Asynchronous;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import java.util.concurrent.Future;

@Stateless
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
  @Asynchronous
  public void sendEmailOrderComplete(Order15 order, Customer15 customer) {
    // Very Long task
    for (int i = 0; i < Integer.MAX_VALUE; i++) {
    }
  }

  @Override
  @Asynchronous
  public void printOrder(Order15 order) {
    // Very Long task
    for (int i = 0; i < Integer.MAX_VALUE; i++) {
    }
  }

  @Override
  @Asynchronous
  public Future<Integer> sendOrderToWorkflow(Order15 order) {
    Integer status = 0;
    // processing
    status = 1;
    if (ctx.wasCancelCalled()) {
      return new AsyncResult<>(2);
    }
    // processing
    return new AsyncResult<>(status);
  }
}