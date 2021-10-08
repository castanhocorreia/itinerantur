package com.itinerantur.medal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@Getter
@NoArgsConstructor
@Setter
public class Medal {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String description;
  private String icon;
  private String name;

  @Override
  public boolean equals(Object object) {
    if (this == object) return true;
    if (object == null || getClass() != object.getClass()) return false;
    Medal medal = (Medal) object;
    return Objects.equals(id, medal.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
