package org.kearis.formation.javaee7.chapitre2.ex14;

import java.util.List;

/**
 * Created by poutsjr on 27/09/2015.
 */
public interface ItemEJBRemote14 {
    List<Book14> findBooks();

    Book14 createBook(Book14 book);

    int inventoryLevel(Book14 book);
}
