package org.kearis.formation.javaee7.chapitre4;

import javax.jws.*;

/**
 * Validator service for credit card. Default implementation.
 */
//TODO add annotation to set endpoint to this class
@WebService
public class CardService implements Validator, Payable {

    /**
     * {@inheritDoc}
     */
    //TODO Add WebMethod with name 'validateCardNumber'
    //TODO Change name of web param to 'card'
    //TODO Change name of result to 'isValidated'
    @WebMethod(operationName = "validateCardNumber")
    @WebResult(name = "isValidated")
    public boolean validate(@WebParam(name = "creditCard") CreditCard creditCard) {
        //TODO Add validation logic
        Character lastDigit = creditCard.getNumber().charAt(creditCard.getNumber().length() - 1);

        if (Integer.parseInt(lastDigit.toString()) % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * {@inheritDoc}
     */
    //TODO Hide the method
    @WebMethod(exclude = true)
    public void hiddenMethod() {
        throw new UnsupportedOperationException("method to hide");
    }

    /**
     * {@inheritDoc}
     */
    //TODO Annotate exception class to adding fault
    @WebMethod
    public void pay(CreditCard creditCard, float amount) throws NotValidCardException {
        if (!validate(creditCard)) {
            throw new NotValidCardException("carte invalide");
        }
        System.out.println("On paye + " + amount);
    }

    /**
     * {@inheritDoc}
     */
    //TODO Add the one way annotation
    @WebMethod
    @Oneway
    public void wakeUpMyBanker() {
        System.out.println("I am awake");
    }
}