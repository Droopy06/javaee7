package org.kearis.formation.javaee7.chapitre3.ex18;

import org.eclipse.persistence.jaxb.rs.MOXyJsonProvider;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("rs")
public class ApplicationConfig18 extends Application {

  // ======================================
  // =             Attributes             =
  // ======================================

  private final Set<Class<?>> classes;

  // ======================================
  // =            Constructors            =
  // ======================================

  public ApplicationConfig18() {
    HashSet<Class<?>> c = new HashSet<>();
    c.add(CustomerRestService18.class);
    c.add(MOXyJsonProvider.class);
    classes = Collections.unmodifiableSet(c);
  }

  // ======================================
  // =          Getters & Setters         =
  // ======================================

  @Override
  public Set<Class<?>> getClasses() {
    return classes;
  }

}