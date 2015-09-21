package org.kearis.formation.javaee7.chapitre1.ex24;

import org.kearis.formation.javaee7.chapitre1.AbstractPersistentTest;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CD24IT extends AbstractPersistentTest {

  // ======================================
  // =              Unit tests            =
  // ======================================

  @Test
  public void shouldCreateACDWithAMapOfTracks() throws Exception {

    HashMap<Integer, String> tracks = new HashMap<>();
    tracks.put(1, "Wind Up Workin' in a Gas Station");
    tracks.put(2, "Black Napkins");
    tracks.put(3, "The Torture Never Stops");
    CD24 cd = new CD24("Zoot Allures", 12.5F, "Released in October 1976, it is mostly a studio album", tracks);
    tx.begin();
    em.persist(cd);
    tx.commit();
    assertNotNull("ID should not be null", cd.getId());
    assertEquals(3, cd.getTracks().size());
  }
}