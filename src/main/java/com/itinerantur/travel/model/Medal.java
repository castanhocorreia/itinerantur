package com.itinerantur.travel.model;

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
    Long id;
    String description;
    String icon;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medal medal = (Medal) o;
        return Objects.equals(id, medal.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
