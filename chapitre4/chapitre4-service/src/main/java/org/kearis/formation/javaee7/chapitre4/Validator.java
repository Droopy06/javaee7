package org.kearis.formation.javaee7.chapitre4;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Validator contrat for creditCard.
 */
public interface Validator {

    /**
     * Allow to validate a credit card. A Credit card is valid if its number is even (2, 4, 6, ...).
     *
     * @param creditCard The Credit card to validate.
     * @return true if the credit car is valid, otherwise false.
     */

    boolean validate(CreditCard creditCard);

    /**
     * Hidden method.
     */
//    @WebMethod(exclude = true)
    void hiddenMethod();

}
