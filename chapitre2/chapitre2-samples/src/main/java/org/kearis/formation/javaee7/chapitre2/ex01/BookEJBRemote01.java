package org.kearis.formation.javaee7.chapitre2.ex01;

import java.io.Serializable;
import java.util.List;

/**
 * Created by poutsjr on 27/09/2015.
 */
public interface BookEJBRemote01 {


    List<Book01> findBooks();

    Book01 findBookById(Long id);

    Book01 createBook(Book01 book);

    void deleteBook(Book01 book);

    Book01 updateBook(Book01 book);
}
