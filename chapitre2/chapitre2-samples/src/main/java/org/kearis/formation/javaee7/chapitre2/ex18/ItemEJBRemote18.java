package org.kearis.formation.javaee7.chapitre2.ex18;

/**
 * Created by poutsjr on 27/09/2015.
 */
public interface ItemEJBRemote18 {
    Item18 convertPrice(Item18 item);

    Item18 convertFixedPrice(Item18 item);
}
