package org.kearis.formation.javaee7.chapitre1.ex51;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

public class Comment51 {

  // ======================================
  // =             Attributes             =
  // ======================================
  private Long id;
  private String nickname;
  private String content;
  private Integer note;

  // ======================================
  // =            Constructors            =
  // ======================================

  public Comment51() {
  }

  public Comment51(String nickname, String content, Integer note) {
    this.nickname = nickname;
    this.content = content;
    this.note = note;
  }

  // ======================================
  // =          Getters & Setters         =
  // ======================================

  public Long getId() {
    return id;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Integer getNote() {
    return note;
  }

  public void setNote(Integer note) {
    this.note = note;
  }
}