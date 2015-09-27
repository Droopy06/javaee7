package org.kearis.formation.javaee7.chapitre2.ex05;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
@Remote
public class ItemEJB05 implements ItemEJBRemote05{

  // ======================================
  // =             Attributes             =
  // ======================================

  @PersistenceContext(unitName = "chapitre2PU")
  private EntityManager em;

  // ======================================
  // =           Public Methods           =
  // ======================================

  @Override
  public List<Book05> findBooks() {
    TypedQuery<Book05> query = em.createNamedQuery(Book05.FIND_ALL, Book05.class);
    return query.getResultList();
  }

  @Override
  public List<CD05> findCDs() {
    TypedQuery<CD05> query = em.createNamedQuery(CD05.FIND_ALL, CD05.class);
    return query.getResultList();
  }

  @Override
  public Book05 createBook(Book05 book) {
    em.persist(book);
    return book;
  }

  @Override
  public CD05 createCD(CD05 cd) {
    em.persist(cd);
    return cd;
  }
}