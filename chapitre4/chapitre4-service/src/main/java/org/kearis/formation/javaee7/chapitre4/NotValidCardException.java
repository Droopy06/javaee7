package org.kearis.formation.javaee7.chapitre4;

import javax.xml.ws.WebFault;

/**
 * Web exception used when a credit card number is not valid
 */
//TODO Add a web fault annoation for using this class as a web fault
@WebFault(name = "CardValidationFault")
public class NotValidCardException extends Exception {

    public NotValidCardException() {
        super();
    }

    public NotValidCardException(String message) {
        super(message);
    }
}
