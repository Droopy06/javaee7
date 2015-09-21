package org.kearis.formation.javaee7.chapitre1.ex49;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Comment49 {

  // ======================================
  // =             Attributes             =
  // ======================================

  private Long id;
  private String nickname;
  private String content;
  private Integer note;
  private Date postedDate;

  // ======================================
  // =            Constructors            =
  // ======================================

  public Comment49() {
  }

  public Comment49(String nickname, String content, Integer note, String postedDate) {
    this.nickname = nickname;
    this.content = content;
    this.note = note;

    try {
      DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
      this.postedDate = df.parse(postedDate);
    } catch (ParseException e) {
      e.printStackTrace();
    }
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