package org.kearis.formation.javaee7.chapitre2.ex05;

import java.io.Serializable;
import java.util.List;

/**
 * Created by poutsjr on 27/09/2015.
 */
public interface ItemEJBRemote05 {
    List<Book05> findBooks();

    List<CD05> findCDs();

    Book05 createBook(Book05 book);

    CD05 createCD(CD05 cd);
}
