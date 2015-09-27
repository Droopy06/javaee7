package org.kearis.formation.javaee7.chapitre2.ex17;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

import static org.kearis.formation.javaee7.chapitre2.ex17.Book17.FIND_ALL;

@Stateless
@LocalBean
public class ItemEJB17 implements ItemLocal17, ItemRemote17 {

  // ======================================
  // =             Attributes             =
  // ======================================

  @PersistenceContext(unitName = "chapitre2PU")
  private EntityManager em;

  // ======================================
  // =           Public Methods           =
  // ======================================

  public List<Book17> findBooks() {
    TypedQuery<Book17> query = em.createNamedQuery(FIND_ALL, Book17.class);
    return query.getResultList();
  }

  public Book17 createBook(Book17 book) {
    em.persist(book);
    return book;
  }
}