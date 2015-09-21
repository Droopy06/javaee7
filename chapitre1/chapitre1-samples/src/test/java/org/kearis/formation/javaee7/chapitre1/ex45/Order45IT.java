package org.kearis.formation.javaee7.chapitre1.ex45;

import org.kearis.formation.javaee7.chapitre1.AbstractPersistentTest;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Order45IT extends AbstractPersistentTest {

  // ======================================
  // =              Unit tests            =
  // ======================================
  @Test
  public void shouldCreateAnOrderWithTwoOrderLines() throws Exception {
    // --- Use JoinColumn ---
    Order45 order = new Order45();
    OrderLine45 ol1 = new OrderLine45("H2G2", 12d, 1);
    OrderLine45 ol2 = new OrderLine45("The White Album", 14.5d, 2);
    List<OrderLine45> orderLines = new ArrayList<OrderLine45>();
    orderLines.add(ol1);
    orderLines.add(ol2);
    order.setOrderLines(orderLines);
    tx.begin();
    em.persist(order);
    em.persist(ol1);
    em.persist(ol2);
    tx.commit();
    assertNotNull("Order ID should not be null", order.getId());
    assertNotNull("OL1 ID should not be null", ol1.getId());
    assertNotNull("OL1 ID should not be null", ol2.getId());

    order = em.find(Order45.class, order.getId());
    assertNotNull("OrderLines should not be null", order.getOrderLines());
    assertEquals("Should have 2 order lines", order.getOrderLines().size(), 2);
  }
}