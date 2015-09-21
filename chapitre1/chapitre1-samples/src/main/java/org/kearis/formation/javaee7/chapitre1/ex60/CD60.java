package org.kearis.formation.javaee7.chapitre1.ex60;

import javax.persistence.Entity;
import javax.persistence.Table;

public class CD60 extends Item60 {

  // ======================================
  // =             Attributes             =
  // ======================================

  private String musicCompany;
  private Integer numberOfCDs;
  private Float totalDuration;
  private String genre;

  // ======================================
  // =            Constructors            =
  // ======================================

  public CD60() {
  }

  public CD60(String title, Float price, String description, String musicCompany, Integer numberOfCDs, Float totalDuration, String genre) {
    super(title, price, description);
    this.musicCompany = musicCompany;
    this.numberOfCDs = numberOfCDs;
    this.totalDuration = totalDuration;
    this.genre = genre;
  }

  // ======================================
  // =          Getters & Setters         =
  // ======================================

  public String getMusicCompany() {
    return musicCompany;
  }

  public void setMusicCompany(String musicCompany) {
    this.musicCompany = musicCompany;
  }

  public Integer getNumberOfCDs() {
    return numberOfCDs;
  }

  public void setNumberOfCDs(Integer numberOfCDs) {
    this.numberOfCDs = numberOfCDs;
  }

  public Float getTotalDuration() {
    return totalDuration;
  }

  public void setTotalDuration(Float totalDuration) {
    this.totalDuration = totalDuration;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }
}