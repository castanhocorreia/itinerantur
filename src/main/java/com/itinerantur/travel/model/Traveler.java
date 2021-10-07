package com.itinerantur.travel.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Entity
@Getter
@NoArgsConstructor
@Setter
public class Traveler {
    LocalDate birthdate;
    @OneToMany
    List<Medal> medals = new ArrayList<>();
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String avatar;
    String email;
    String password;
    String username;

    public Traveler(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void decorate(Medal decoration) {
        Optional<Medal> duplication = medals.stream().filter(medal -> medal.equals(decoration)).findAny();
        if (!duplication.isPresent()) {
            medals.add(decoration);
        }
    }
}
