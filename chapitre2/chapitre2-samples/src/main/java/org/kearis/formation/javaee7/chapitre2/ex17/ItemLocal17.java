package org.kearis.formation.javaee7.chapitre2.ex17;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ItemLocal17 {

  // ======================================
  // =           Public Methods           =
  // ======================================

  List<Book17> findBooks();

}