package org.kearis.formation.javaee7.chapitre1_1.ex21;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.kearis.formation.javaee7.chapitre1_1.ex21.Address21;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-09-22T22:43:26")
@StaticMetamodel(Customer21.class)
public class Customer21_ { 

    public static volatile SingularAttribute<Customer21, Long> id;
    public static volatile SingularAttribute<Customer21, String> lastName;
    public static volatile SingularAttribute<Customer21, String> email;
    public static volatile SingularAttribute<Customer21, Address21> address;
    public static volatile SingularAttribute<Customer21, Integer> age;
    public static volatile SingularAttribute<Customer21, String> firstName;

}