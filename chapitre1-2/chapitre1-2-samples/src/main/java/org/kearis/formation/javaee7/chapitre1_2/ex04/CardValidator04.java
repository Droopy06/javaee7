package org.kearis.formation.javaee7.chapitre1_2.ex04;

import javax.validation.Valid;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class CardValidator04 {

  private ValidationAlgorithm validationAlgorithm;

  // ======================================
  // =            Constructors            =
  // ======================================


  public CardValidator04() {
  }

  public CardValidator04(ValidationAlgorithm validationAlgorithm) {
    this.validationAlgorithm = validationAlgorithm;
  }

  // ======================================
  // =           Public Methods           =
  // ======================================

//  @AssertTrue
  public Boolean validate(CreditCard04 creditCard) {

    String lastDigit = validationAlgorithm.validate(creditCard.getNumber(), creditCard.getControlNumber());

    if (Integer.parseInt(lastDigit.toString()) % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  @AssertTrue
  public Boolean validate(String number, Date expiryDate, Integer controlNumber, String type) {

    String lastDigit = validationAlgorithm.validate(number, controlNumber);

    if (Integer.parseInt(lastDigit.toString()) % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  private class ValidationAlgorithm {

    public String validate(String number, Integer controlNumber) {
      Character lastDigit = number.charAt(number.length() - 1);
      return lastDigit.toString();
    }
  }
}