package org.kearis.formation.javaee7.chapitre1_1.ex42;

import javax.persistence.*;

public class DebugListener {

    // ======================================
    // =          Lifecycle Methods         =
    // ======================================

//    @PrePersist
    void prePersist(Object object) {
        System.out.println("++ prePersist");
    }

//    @PostPersist
    void postPersist(Object object) {
        System.out.println("++ postPersist");
    }

//    @PreUpdate
    void preUpdate(Object object) {
        System.out.println("++ preUpdate");
    }

//    @PostUpdate
    void postUpdate(Object object) {
        System.out.println("++ postUpdate");
    }

//    @PreRemove
    void preRemove(Object object) {
        System.out.println("++ preRemove");
    }

//    @PostRemove
    void postRemove(Object object) {
        System.out.println("++ postRemove");
    }

//    @PostLoad
    void postLoad(Object object) {
        System.out.println("++ postLoad");
    }
}