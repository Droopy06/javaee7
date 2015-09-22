package org.kearis.formation.javaee7.chapitre1_2.ex06;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@NotNull
@Constraint(validatedBy = {})
public @interface GreaterThanZero {

  String message() default "Should be greather than zero";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
