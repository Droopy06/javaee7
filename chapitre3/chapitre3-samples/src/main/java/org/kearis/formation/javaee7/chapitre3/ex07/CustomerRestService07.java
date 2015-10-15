package org.kearis.formation.javaee7.chapitre3.ex07;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//TODO add Path
//TODO produce XML by default
public class  CustomerRestService07 {

  // ======================================
  // =           Public Methods           =
  // ======================================

  /**
   * curl http://localhost:8080/chapitre3-service-1.0/rs/07/customers/agoncal
   */
  //TODO define action 'search' in path with 'text' as path parameter
  public List<Customer07> searchCustomers(String textToSearch) {
    System.out.println("searchCustomer : " + textToSearch);
    Customers07 customers = new Customers07();
    customers.add(new Customer07("John", "Smith", "jsmith@gmail.com", "1234565", new Date(), new Date()));
    customers.add(new Customer07("John", "Smith", "jsmith@gmail.com", "1234565", new Date(), new Date()));
    return customers;
  }

  /**
   * curl http://localhost:8080/chapitre3-service-1.0/rs/07/customers/agoncal
   */
  //TODO define method to retrieve customer by login only letters are allowed
  public Customer07 getCustomerByLogin(String login) {
    System.out.println("getCustomerByLogin : " + login);
    return new Customer07("John", "Smith", "jsmith@gmail.com", "1234565", new Date(), new Date());
  }

  /**
   * curl http://localhost:8080/chapitre3-service-1.0/rs/07/customers/agoncal
   */
  //TODO define method to retrieve customer by numeric identifier only
  public Customer07 getCustomerById(String id) {
    System.out.println("getCustomerById : " + id);
    return new Customer07("John", "Smith", "jsmith@gmail.com", "1234565", new Date(), new Date());
  }

  //TODO define method to retrieve customers with zipcode and city (default value is Paris if not given) as query parameters
  public List<Customer07> getCustomersByZipCodeCity(Long zip, String city) {
    System.out.println("getCustomerByZipCodeCity : " + zip + " - " + city);
    List<Customer07> customers = new ArrayList<>();
    customers.add(new Customer07("John", "Smith", "jsmith@gmail.com", "1234565", new Date(), new Date()));
    customers.add(new Customer07("John", "Smith", "jsmith@gmail.com", "1234565", new Date(), new Date()));
    return customers;
  }

  //TODO define method to retrieve customers with matrix parameters
  public List<Customer07> getCustomersByFirstnameName(String firstname, String surname) {
    System.out.println("getCustomerByFirstnameName : " + firstname + " - " + surname);
    List<Customer07> customers = new ArrayList<>();
    customers.add(new Customer07("John", "Smith", "jsmith@gmail.com", "1234565", new Date(), new Date()));
    customers.add(new Customer07("John", "Smith", "jsmith@gmail.com", "1234565", new Date(), new Date()));
    return customers;
  }

  //TODO define method to extract sessionId of cookie
  @GET
  @Path("cookie")
  @Produces(MediaType.TEXT_PLAIN)
  public String extractSessionID(String sessionID) {
    System.out.println("extractSessionID : " + sessionID);
    return sessionID + " from the server";
  }

  //TODO define method to extract 'User-Agent' of header
  @GET
  @Path("userAgent")
  @Produces(MediaType.TEXT_PLAIN)
  public String extractUserAgent(String userAgent) {
    System.out.println("echoUserAgent : " + userAgent);
    return userAgent + " from the server";
  }

}