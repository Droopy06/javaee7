package org.kearis.formation.javaee7.chapitre3.ex15;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.net.URI;
import java.util.List;

@Path("/15/customer")
public class CustomerRestService15 {

  // ======================================
  // =             Attributes             =
  // ======================================

  //FIXME how to inject UriInfo here ??
  UriInfo uriInfo;

  //@Inject
  CustomerEJB15 customerEJB = new CustomerEJB15();

  // ======================================
  // =           Public Methods           =
  // ======================================

  @GET
  @Path("ping")
  @Produces(MediaType.TEXT_PLAIN)
  public String ping() {
    return "ping";
  }

  @GET
  @Path("media")
  //TODO try to inject HttpHeaders to retieve header information
  public String getDefaultMediaType(HttpHeaders headers) {
    List<MediaType> mediaTypes = headers.getAcceptableMediaTypes();
    return mediaTypes.get(0).toString();
  }

  @GET
  @Path("language")
  //TODO try to inject HttpHeaders to retieve header information
  public String getDefaultLanguage(HttpHeaders headers) {
    List<String> mediaTypes = headers.getRequestHeader(HttpHeaders.ACCEPT_LANGUAGE);
    return mediaTypes.get(0);
  }

  @POST
  @Consumes(MediaType.APPLICATION_XML)
  public Response createCustomer(Customer15 cust) {
    Customer15 customer = customerEJB.persist(cust);
    URI bookUri = uriInfo.getAbsolutePathBuilder().path(customer.getId().toString()).build();
    return Response.created(bookUri).build();
  }

  private class CustomerEJB15 {
    public Customer15 persist(Customer15 customer) {
      return new Customer15(1L, "John", "Smith", "jsmith@gmail.com", "1234565");
    }
  }
}
