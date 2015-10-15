package org.kearis.formation.javaee7.chapitre3.ex14;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/14/book")
public class BookRestService14 {

    // ======================================
    // =           Public Methods           =
    // ======================================

    @GET
    @Produces("text/plain")
    public String getBookTitle() {
        return "H2G2";
    }
}