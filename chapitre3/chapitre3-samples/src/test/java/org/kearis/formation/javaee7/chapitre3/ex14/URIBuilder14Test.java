package org.kearis.formation.javaee7.chapitre3.ex14;

import org.junit.Test;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;

import static org.junit.Assert.assertEquals;

public class URIBuilder14Test {

  // ======================================
  // =              Unit tests            =
  // ======================================

  @Test
  public void shouldBuildURIs() {
      //TODO define URI with UriBuilder
    URI uri = null;

      //first example together
    uri = UriBuilder.fromUri("http://www.myserver.com").path("book").path("1234").build();
    assertEquals("http://www.myserver.com/book/1234", uri.toString());

    //uri = ...
    assertEquals("http://www.myserver.com/book?author=Goncalves", uri.toString());

      //uri = ...
    assertEquals("http://www.myserver.com/book;author=Goncalves", uri.toString());

      //uri = ...
      assertEquals("http://www.myserver.com/book?author=Goncalves", uri.toString());

      //uri = ...
    assertEquals("/14/book/1234", uri.toString());

      //uri = ...
    assertEquals("//www.myserver.com/14/book/book/1234", uri.toString());

      //uri = ...
    assertEquals("//www.myserver.com:8282/14/book/book/1234", uri.toString());

      //uri = ...
    assertEquals("http://www.myserver.com/#book", uri.toString());

  }
}