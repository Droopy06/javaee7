package org.kearis.formation.javaee7.chapitre2.ex17;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface ItemRemote17 {

  // ======================================
  // =           Public Methods           =
  // ======================================

  List<Book17> findBooks();

  Book17 createBook(Book17 book);
}