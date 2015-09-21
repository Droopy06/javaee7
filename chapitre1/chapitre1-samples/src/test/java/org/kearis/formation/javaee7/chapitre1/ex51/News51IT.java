package org.kearis.formation.javaee7.chapitre1.ex51;

import org.kearis.formation.javaee7.chapitre1.AbstractPersistentTest;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class News51IT extends AbstractPersistentTest {

  // ======================================
  // =              Unit tests            =
  // ======================================
  @Test
  @Ignore("@OrderColumn doesn't seem to work")
  public void shouldCreateOneNewsWithFourComments() throws Exception {

    News51 news = new News51("Death of Michael Jackson");
    news.addComment(new Comment51("gonzo", "Third comment", 1));
    news.addComment(new Comment51("elvis", "First comment", 3));
    news.addComment(new Comment51("gonzo", "Second comment", 5));
    news.addComment(new Comment51("elvis", "Fourth comment", 2));

    tx.begin();
    em.persist(news);
    tx.commit();

    tx.begin();
    news = em.find(News51.class, news.getId());

    // Without the refresh the test will not work
    // The OrderBy annotation specifies the ordering of the elements of a collection valued association at the point when the association is retrieved."
    // The key here is the phrase "when the association is retrieved".  In this case, when your find is executed, the association is still managed and no retrieval logic occurs.
    em.refresh(news);

    tx.commit();

    assertEquals("Death of Michael Jackson", news.getContent());
    assertEquals(4, news.getComments().size());
    assertEquals("Fourth comment", news.getComments().get(0).getContent());
    assertEquals("Third comment", news.getComments().get(1).getContent());
    assertEquals("Second comment", news.getComments().get(2).getContent());
    assertEquals("First comment", news.getComments().get(3).getContent());
  }
}