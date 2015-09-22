package org.kearis.formation.javaee7.chapitre1_1.ex03;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.kearis.formation.javaee7.chapitre1_1.ex03.Address03;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-09-22T22:43:26")
@StaticMetamodel(Customer03.class)
public class Customer03_ { 

    public static volatile SingularAttribute<Customer03, Long> id;
    public static volatile SingularAttribute<Customer03, String> lastName;
    public static volatile SingularAttribute<Customer03, String> email;
    public static volatile SingularAttribute<Customer03, Address03> address;
    public static volatile SingularAttribute<Customer03, String> firstName;

}