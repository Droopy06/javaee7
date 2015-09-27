package org.kearis.formation.javaee7.chapitre2.ex18;

import javax.annotation.Resource;
import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote
public class ItemEJB18 implements ItemEJBRemote18{

  // ======================================
  // =             Attributes             =
  // ======================================

  @Resource(name = "currencyEntry")
  private String currency;
  @Resource(name = "changeRateEntry")
  private Float changeRate;

  // ======================================
  // =           Public Methods           =
  // ======================================

  @Override
  public Item18 convertPrice(Item18 item) {
    item.setPrice(item.getPrice() * changeRate);
    item.setCurrency(currency);
    return item;
  }

  @Override
  public Item18 convertFixedPrice(Item18 item) {
    item.setPrice(item.getPrice() * 0.80F);
    item.setCurrency("Euros");
    return item;
  }
}