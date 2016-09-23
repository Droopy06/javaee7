package org.kearis.formation.javaee7.chapitre1.ex24;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;
@Entity
public class CD24 {

  // ======================================
  // =             Attributes             =
  // ======================================

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String title;
  private Float price;
  private String description;
  @Basic(fetch = FetchType.LAZY)
  @Lob
  private byte[] cover;
  @ElementCollection(fetch = FetchType.LAZY)
  private Map<Integer, String> tracks = new HashMap<>();

  // ======================================
  // =            Constructors            =
  // ======================================

  public CD24() {
  }

  public CD24(String title, Float price, String description, HashMap<Integer, String> tracks) {
    this.title = title;
    this.price = price;
    this.description = description;
    this.tracks = tracks;
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

  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public byte[] getCover() {
    return cover;
  }

  public void setCover(byte[] cover) {
    this.cover = cover;
  }

  public Map<Integer, String> getTracks() {
    return tracks;
  }

  public void setTracks(HashMap<Integer, String> tracks) {
    this.tracks = tracks;
  }
}
