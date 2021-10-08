package com.itinerantur.travel.traveller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor
@Setter
public class Traveller {
  LocalDate birthdate;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  String avatar;
  String email;
  String name;
  String password;
}
