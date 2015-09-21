package org.kearis.formation.javaee7.chapitre1.ex06;

import org.kearis.formation.javaee7.chapitre1.AbstractPersistentTest;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class News06IT extends AbstractPersistentTest {

  // ======================================
  // =              Unit tests            =
  // ======================================

  @Test
  public void shouldCreateANews() throws Exception {

    News06 news = new News06("Richard Wright has died", "EN", "The keyboard of Pink Floyd has died today");
    NewsId06 newsId = new NewsId06();
    newsId.setLanguage(news.getLanguage());
    newsId.setTitle(news.getTitle());
    assertNull("News should not be found", em.find(News06.class, newsId));
    tx.begin();
    em.persist(news);
    tx.commit();
    News06 found = em.find(News06.class, newsId);
    assertNotNull("News should be found", found);
  }
}