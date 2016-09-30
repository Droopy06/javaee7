package org.kearis.formation.javaee7.chapitre1.ex49;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "News49")
public class News49 {

  // ======================================
  // =             Attributes             =
  // ======================================
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ID")
  private Long id;
  private String content;
  @OneToMany(cascade = {CascadeType.PERSIST},fetch = FetchType.EAGER)
  @JoinColumn(name = "comment49_id")
  @OrderBy("ID DESC")
  private List<Comment49> comments;

  // ======================================
  // =            Constructors            =
  // ======================================

  public News49() {
  }

  public News49(String content) {
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

  public void addComment(Comment49 comment) {
    if (comments == null)
      comments = new ArrayList<Comment49>();
    comments.add(comment);
  }

  public List<Comment49> getComments() {
    return comments;
  }
}