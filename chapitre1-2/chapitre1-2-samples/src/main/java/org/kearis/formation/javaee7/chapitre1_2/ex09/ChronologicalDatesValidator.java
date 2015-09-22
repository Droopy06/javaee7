package org.kearis.formation.javaee7.chapitre1_2.ex09;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ChronologicalDatesValidator implements ConstraintValidator<ChronologicalDates, Order09> {

  @Override
  public void initialize(ChronologicalDates constraintAnnotation) {
  }

  @Override
  public boolean isValid(Order09 order, ConstraintValidatorContext context) {
    return order.getCreationDate().getTime() < order.getPaymentDate().getTime() && order.getPaymentDate().getTime() < order.getDeliveryDate().getTime();
  }
}
