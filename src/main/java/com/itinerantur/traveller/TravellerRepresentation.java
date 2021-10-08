package com.itinerantur.traveller;

import lombok.Getter;

@Getter
public class TravellerRepresentation {
  private final Long id;
  private final String name;

  public TravellerRepresentation(Traveller traveller) {
    this.id = traveller.getId();
    this.name = traveller.getName();
  }
}
