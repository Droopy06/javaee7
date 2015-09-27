package org.kearis.formation.javaee7.chapitre2.ex02;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface ItemRemote02 {

  // ======================================
  // =           Public Methods           =
  // ======================================

  List<Book02> findBooks();

  List<CD02> findCDs();

  Book02 createBook(Book02 book);

  CD02 createCD(CD02 cd);
}