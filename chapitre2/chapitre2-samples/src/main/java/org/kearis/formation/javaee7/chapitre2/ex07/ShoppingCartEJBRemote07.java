package org.kearis.formation.javaee7.chapitre2.ex07;

import javax.ejb.Remove;

/**
 * Created by poutsjr on 27/09/2015.
 */
public interface ShoppingCartEJBRemote07 {
    void addItem(Item07 item);

    void removeItem(Item07 item);

    Integer getNumberOfItems();

    Float getTotal();

    void empty();

    @Remove
    void checkout();
}
