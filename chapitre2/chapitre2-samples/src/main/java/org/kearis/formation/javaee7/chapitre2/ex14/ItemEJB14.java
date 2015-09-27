package org.kearis.formation.javaee7.chapitre2.ex14;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

import static org.kearis.formation.javaee7.chapitre2.ex14.Book14.*;

@Stateless
public class ItemEJB14 implements ItemEJBRemote14 {

  // ======================================
  // =             Attributes             =
  // ======================================

  @PersistenceContext(unitName = "chapitre2PU")
  private EntityManager em;

  @Resource
  private SessionContext context;

  private static final int TOO_MANY_BOOKS = 1000;

  // ======================================
  // =           Public Methods           =
  // ======================================

  @Override
  public List<Book14> findBooks() {
    TypedQuery<Book14> query = em.createNamedQuery(FIND_ALL, Book14.class);
    return query.getResultList();
  }

  @Override
  public Book14 createBook(Book14 book) {
    if (!context.isCallerInRole("admin"))
      throw new SecurityException("Only admins can create books");

    em.persist(book);

    if (inventoryLevel(book) == TOO_MANY_BOOKS)
      context.setRollbackOnly();

    return book;
  }

  @Override
  public int inventoryLevel(Book14 book) {
    return 0;
  }
}