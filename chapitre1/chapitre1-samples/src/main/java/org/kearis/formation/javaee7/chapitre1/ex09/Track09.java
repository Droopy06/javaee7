package org.kearis.formation.javaee7.chapitre1.ex09;

import javax.persistence.*;

public class Track09 {

  // ======================================
  // =             Attributes             =
  // ======================================

  private Long id;
  private String title;
  private Float duration;
  private byte[] wav;
  private String description;

  // ======================================
  // =            Constructors            =
  // ======================================

  public Track09() {
  }

  public Track09(String title, Float duration, String description) {
    this.title = title;
    this.duration = duration;
    this.description = description;
  }

  // ======================================
  // =          Getters & Setters         =
  // ======================================

  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Float getDuration() {
    return duration;
  }

  public void setDuration(Float duration) {
    this.duration = duration;
  }

  public byte[] getWav() {
    return wav;
  }

  public void setWav(byte[] wav) {
    this.wav = wav;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
