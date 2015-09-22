package org.kearis.formation.javaee7.chapitre1_1.ex42;

import javax.persistence.*;

public class CustomerListener {

    // ======================================
    // =          Lifecycle Methods         =
    // ======================================

//    @PrePersist
    void prePersist(Customer42 customer05) {
        System.out.println(". prePersist");
    }

//    @PreUpdate
    void preUpdate(Customer42 customer05) {
        System.out.println(". preUpdate");
    }

//    @PreRemove
    void preRemove(Customer42 customer05) {
        System.out.println(". preRemove");
    }

//    @PostLoad
    void postLoad(Customer42 customer05) {
        System.out.println(". postLoad");
    }

//    @PostRemove
    void postRemove(Customer42 customer05) {
        System.out.println(". postRemove");
    }

//    @PostUpdate
    void postUpdate(Customer42 customer05) {
        System.out.println(". postUpdate");
    }

//    @PostPersist
    void postPersist(Customer42 customer05) {
        System.out.println(". postPersist");
    }
}