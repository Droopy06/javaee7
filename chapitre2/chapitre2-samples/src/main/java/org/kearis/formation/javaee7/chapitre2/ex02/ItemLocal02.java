package org.kearis.formation.javaee7.chapitre2.ex02;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ItemLocal02 {

  // ======================================
  // =           Public Methods           =
  // ======================================

  List<Book02> findBooks();

  List<CD02> findCDs();

}