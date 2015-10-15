package org.kearis.formation.javaee7.chapitre3.ex18;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/18/customer")
public class CustomerRestService18 {

  // ======================================
  // =             Attributes             =
  // ======================================

  //@Inject
  private CustomerEJB18 customerEJB = new CustomerEJB18();

  // ======================================
  // =           Public Methods           =
  // ======================================

  @GET
  @Path("ping")
  @Produces(MediaType.TEXT_PLAIN)
  public String ping() {
    return "ping";
  }

  //TODO define method that throws IllegalArgumentException if path parameter customerId < 1000
  //TODO the method throws WebApplicationException when customer was not found
  @Path("{customerId}")
  public Customer18 getCustomer(Long customerId) {
    Customer18 customer = customerEJB.find(customerId);
    return customer;
  }

  /**
   * Fake EJB
   */
  private class CustomerEJB18 {
    /**
     * Service that never find a customer
     * @param customerId the customer Identifier
     * @return nobody
     */
    public Customer18 find(Long customerId) {
      return null;
    }
  }

}