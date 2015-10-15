package org.kearis.formation.javaee7.chapitre3;

import org.kearis.formation.javaee7.chapitre3.ex03.BookRestService03;
import org.kearis.formation.javaee7.chapitre3.ex05.ItemRestService05;
import org.kearis.formation.javaee7.chapitre3.ex15.CustomerRestService15;
import org.eclipse.persistence.jaxb.rs.MOXyJsonProvider;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("rs")
public class ApplicationConfig extends Application {

  // ======================================
  // =             Attributes             =
  // ======================================

  private final Set<Class<?>> classes;

  // ======================================
  // =            Constructors            =
  // ======================================

  public ApplicationConfig() {
    HashSet<Class<?>> c = new HashSet<>();
    c.add(BookRestService03.class);
    c.add(ItemRestService05.class);
    c.add(CustomerRestService15.class);

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