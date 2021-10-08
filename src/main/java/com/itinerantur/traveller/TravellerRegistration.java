package com.itinerantur.traveller;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class TravellerRegistration {
  private LocalDate birthdate;
  private String birthPlace;
  private String email;
  private String name;
  private String password;

  public Traveller convert() {
    return new Traveller();
  }
}
