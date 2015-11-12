package org.kearis.formation.javaee7.chapitre4;

import javax.jws.WebService;

/**
 * Payable contract for creditCard.
 */
public interface Payable {

    /**
     * Allow to pay the amount given as parameter.
     *
     * @param creditCard The card used to pay.
     * @param amount     The amount to pay.
     * @throws NotValidCardException Thrown when a credit card number is not valid.
     */
    void pay(CreditCard creditCard, float amount) throws NotValidCardException;

    /**
     * Allow to wake up my f*****g banker :)
     */
    void wakeUpMyBanker();
}
