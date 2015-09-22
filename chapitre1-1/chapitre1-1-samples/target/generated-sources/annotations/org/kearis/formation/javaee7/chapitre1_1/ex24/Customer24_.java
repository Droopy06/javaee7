package org.kearis.formation.javaee7.chapitre1_1.ex24;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.kearis.formation.javaee7.chapitre1_1.ex24.Address24;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-09-22T22:43:26")
@StaticMetamodel(Customer24.class)
public class Customer24_ { 

    public static volatile SingularAttribute<Customer24, Long> id;
    public static volatile SingularAttribute<Customer24, String> lastName;
    public static volatile SingularAttribute<Customer24, String> email;
    public static volatile SingularAttribute<Customer24, Address24> address;
    public static volatile SingularAttribute<Customer24, Integer> age;
    public static volatile SingularAttribute<Customer24, String> firstName;

}