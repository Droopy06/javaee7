package org.kearis.formation.javaee7.chapitre2.ex01;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.SynchronizationType;
import javax.persistence.TypedQuery;
import java.util.List;

import static org.kearis.formation.javaee7.chapitre2.ex01.Book01.*;

@Stateless
@Remote
public class BookEJB01 implements BookEJBRemote01 {

  // ======================================
  // =             Attributes             =
  // ======================================

  @PersistenceContext(unitName = "chapitre2PU")
  private EntityManager em;

  // ======================================
  // =           Public Methods           =
  // ======================================

  @Override
  public List<Book01> findBooks() {
    TypedQuery<Book01> query = em.createNamedQuery(FIND_ALL, Book01.class);
      em.joinTransaction();
    return query.getResultList();
  }

  @Override
  public Book01 findBookById(Long id) {
    return em.find(Book01.class, id);
  }

  @Override
  public Book01 createBook(Book01 book) {
    em.persist(book);
    return book;
  }

  @Override
  public void deleteBook(Book01 book) {
    em.remove(em.merge(book));
  }

  @Override
  public Book01 updateBook(Book01 book) {
    return em.merge(book);
  }
}