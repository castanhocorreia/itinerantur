package com.itinerantur.traveller;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class TravellerRegister {
  LocalDate birthdate;
  String birthPlace;
  String email;
  String name;
  String password;
}
