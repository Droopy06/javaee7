package org.kearis.formation.javaee7.chapitre1.ex04;

import org.kearis.formation.javaee7.chapitre1.AbstractPersistentTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class News04IT extends AbstractPersistentTest {

  // ======================================
  // =              Unit tests            =
  // ======================================

  @Test
  public void shouldCreateANews() throws Exception {

    News04 news = new News04(new NewsId04("Richard Wright has died", "EN"), "The keyboard of Pink Floyd has died today");
    tx.begin();
    em.persist(news);
    tx.commit();

    news = em.find(News04.class, new NewsId04("Richard Wright has died", "EN"));

    assertEquals("The keyboard of Pink Floyd has died today", news.getContent());
  }
}