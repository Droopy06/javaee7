package org.kearis.formation.javaee7.chapitre1.ex51;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class News51 {

  // ======================================
  // =             Attributes             =
  // ======================================

  private Long id;
  private String content;
  private List<Comment51> comments;

  // ======================================
  // =            Constructors            =
  // ======================================

  public News51() {
  }

  public News51(String content) {
    this.content = content;
  }

  // ======================================
  // =          Getters & Setters         =
  // ======================================

  public Long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void addComment(Comment51 comment) {
    if (comments == null)
      comments = new ArrayList<Comment51>();
    comments.add(comment);
  }

  public List<Comment51> getComments() {
    return comments;
  }
}