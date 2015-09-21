package org.kearis.formation.javaee7.chapitre1.ex06;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

public class News06 {

  // ======================================
  // =             Attributes             =
  // ======================================

  private String title;
  private String language;
  private String content;

  // ======================================
  // =            Constructors            =
  // ======================================

  public News06() {
  }

  public News06(String title, String language, String content) {
    this.title = title;
    this.language = language;
    this.content = content;
  }

  // ======================================
  // =          Getters & Setters         =
  // ======================================

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}