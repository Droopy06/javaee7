package org.kearis.formation.javaee7.chapitre3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class URISplitTest {

  @Test
  public void shouldGetTheLastPath() {

    String id = "http://localhost:8080/chapitre3-service-1.0/rs/book/33".split("/")[6];
    assertEquals("33", id);
  }
}
