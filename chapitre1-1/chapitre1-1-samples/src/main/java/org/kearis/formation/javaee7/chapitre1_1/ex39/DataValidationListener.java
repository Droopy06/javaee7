package org.kearis.formation.javaee7.chapitre1_1.ex39;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

public class DataValidationListener {

    // ======================================
    // =          Lifecycle Methods         =
    // ======================================

//    @PrePersist
//    @PreUpdate
    private void validate(Customer39 customer) {
        System.out.println("DataValidationListener validateData()");
        if (customer.getFirstName() == null || "".equals(customer.getFirstName()))
            throw new IllegalArgumentException("Invalid first name");
        if (customer.getLastName() == null || "".equals(customer.getLastName()))
            throw new IllegalArgumentException("Invalid last name");
    }
}