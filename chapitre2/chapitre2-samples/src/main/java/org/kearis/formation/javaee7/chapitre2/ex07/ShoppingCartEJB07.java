package org.kearis.formation.javaee7.chapitre2.ex07;

import javax.ejb.Remote;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.ejb.StatefulTimeout;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Stateful
@StatefulTimeout(value = 20, unit = TimeUnit.SECONDS)
@Remote
public class ShoppingCartEJB07 implements ShoppingCartEJBRemote07 {

  // ======================================
  // =             Attributes             =
  // ======================================

  private List<Item07> cartItems = new ArrayList<>();

  // ======================================
  // =           Public Methods           =
  // ======================================

  @Override
  public void addItem(Item07 item) {
    if (!cartItems.contains(item))
      cartItems.add(item);
  }

  @Override
  public void removeItem(Item07 item) {
    if (cartItems.contains(item))
      cartItems.remove(item);
  }

  @Override
  public Integer getNumberOfItems() {
    if (cartItems == null || cartItems.isEmpty())
      return 0;
    return cartItems.size();
  }

  @Override
  public Float getTotal() {
    if (cartItems == null || cartItems.isEmpty())
      return 0f;

    Float total = 0f;
    for (Item07 cartItem : cartItems) {
      total += (cartItem.getPrice());
    }
    return total;
  }

  @Override
  public void empty() {
    cartItems.clear();
  }

  @Override
  @Remove
  public void checkout() {
    // Do some business logic
    cartItems.clear();
  }
}