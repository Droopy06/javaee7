package org.kearis.formation.javaee7.chapitre1.ex09;

import org.kearis.formation.javaee7.chapitre1.AbstractPersistentTest;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class Track09IT extends AbstractPersistentTest {

  // ======================================
  // =              Unit tests            =
  // ======================================

  @Test
  public void shouldCreateATrack() throws Exception {

    Track09 track = new Track09("Sgt Pepper Lonely Heart Club Ban", 4.53f, "Listen to the trumpet carefully, it's George Harrison playing");
    tx.begin();
    em.persist(track);
    tx.commit();
    assertNotNull("ID should not be null", track.getId());
  }
}