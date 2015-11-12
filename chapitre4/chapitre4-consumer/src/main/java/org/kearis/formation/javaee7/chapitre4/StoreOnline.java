package org.kearis.formation.javaee7.chapitre4;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebServiceRef;

/**
 *
 */
@WebService
public class StoreOnline {

    //TODO Inject Service to call
//    @WebServiceRef
    private CardServiceService service;

    @WebMethod
    public boolean sell(@WebParam(name = "itemId") long itemId, @WebParam(name = "amount") float amount, @WebParam(name = "creditCardNumber") String creditCardNumber) {
        CardService port = service.getCardServicePort();
        CreditCard card = new CreditCard();
        card.setNumber(creditCardNumber);
        try {
            port.pay(card, amount);
            return true;
        } catch (NotValidCardException_Exception e) {
            return false;
        }
    }
}
