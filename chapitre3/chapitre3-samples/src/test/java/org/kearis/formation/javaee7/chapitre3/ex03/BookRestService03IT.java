package org.kearis.formation.javaee7.chapitre3.ex03;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.glassfish.jersey.message.internal.MediaTypes;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.ext.RuntimeDelegate;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BookRestService03IT {

  // ======================================
  // =             Attributes             =
  // ======================================

  private static HttpServer server;
  private static URI uri = UriBuilder.fromUri("http://localhost/").port(8282).build();
  private static Client client = ClientBuilder.newClient();

  // ======================================
  // =          Lifecycle Methods         =
  // ======================================

  @BeforeClass
  public static void init() throws IOException {
    // create a new server listening at port 8282
    server = HttpServer.create(new InetSocketAddress(uri.getPort()), 0);

    // create a handler wrapping the JAX-RS application
    HttpHandler handler = RuntimeDelegate.getInstance().createEndpoint(new ApplicationConfig03(), HttpHandler.class);

    // map JAX-RS handler to the server root
    server.createContext(uri.getPath(), handler);

    // start the server
    server.start();
  }

  @AfterClass
  public static void stop() {
    server.stop(0);
  }

  // ======================================
  // =              Unit tests            =
  // ======================================

  @Test
  public void shouldCheckForH2G2Verbose() throws URISyntaxException {

    Client client = ClientBuilder.newClient();
    WebTarget target = client.target("http://localhost:8282/03/book");
    assertEquals(Response.Status.OK.getStatusCode(), target.request(MediaType.TEXT_PLAIN).get().getStatus());
    URI uri = new URI("http://localhost:8282/03/book");
    target = client.target(uri);
    assertEquals(Response.Status.OK.getStatusCode(), target.request(MediaType.TEXT_PLAIN).get().getStatus());
  }

  @Test
  public void shouldCheckForH2G2WithWebTarget() {

    Client client = ClientBuilder.newClient();
    WebTarget target = client.target("http://localhost:8282/03/book");
    Invocation.Builder builder = target.request(MediaType.TEXT_PLAIN);
    Response response = builder.get();
    String entity = response.readEntity(String.class);

    assertEquals("H2G2", entity);
    assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
  }

  @Test
  public void shouldCheckForH2G2WithInvocation() {

    Client client = ClientBuilder.newClient();
    WebTarget target = client.target("http://localhost:8282/03/book");
    Invocation invocation = target.request(MediaType.TEXT_PLAIN).buildGet();
    Response response = invocation.invoke();
    String entity = response.readEntity(String.class);

    assertEquals("H2G2", entity);
    assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
  }

  @Test
  public void shouldCheckForH2G2String() {
    assertEquals("H2G2", ClientBuilder.newClient().target("http://localhost:8282/03/book").request().get(String.class));
  }

  @Test
  public void shouldCheckForH2G2Entity() {
    Response response = ClientBuilder.newClient().target("http://localhost:8282/03/book").request().get();
    assertEquals("H2G2", response.readEntity(String.class));
  }

  @Test
  public void shouldCheckForWrongMediaType() {
    Response response = ClientBuilder.newClient().target("http://localhost:8282/03/book").request(MediaType.APPLICATION_OCTET_STREAM).get();
    assertEquals(Response.Status.NOT_ACCEPTABLE.getStatusCode(), response.getStatus());
  }

  @Test
  public void shouldCheckForWrongURI() {
    Response response = ClientBuilder.newClient().target("http://localhost:8282/03/dummy").request(MediaType.TEXT_PLAIN).get();
    assertEquals(Response.Status.NOT_FOUND.getStatusCode(), response.getStatus());
  }

  @Test
  public void shouldCheckForH2G2Short() {
    assertEquals("H2G2", client.target(uri).path("03/book").request(MediaType.TEXT_PLAIN).get(String.class));
  }

  @Test
  public void shouldCheckForH2G2WithSeveralPaths() {
    assertEquals("H2G2", client.target(uri).path("03").path("book").request(MediaType.TEXT_PLAIN).get(String.class));
  }

  @Test
  public void shouldCheckForH2G2WithResponse() {
    Response response = client.target(UriBuilder.fromUri(uri).path("03/book").build()).request("text/plain").get();
    assertEquals(200, response.getStatus());
    assertTrue(response.hasEntity());
    assertTrue("H2G2".equals(response.readEntity(String.class)));
  }

  @Test
  public void shouldCheckForApplicationWadl() {
    assertTrue(ClientBuilder.newClient().target(uri).path("application.wadl").request(MediaTypes.WADL).get(String.class).length() > 0);
  }
}
