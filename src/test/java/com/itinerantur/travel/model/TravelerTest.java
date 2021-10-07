package com.itinerantur.travel.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TravelerTest {
  Traveler traveler;

  @BeforeEach
  void init() {
    traveler = new Traveler("username", "password");
  }

  @Test
  void shouldIgnoreRepeatedMedals() {
    Medal firstMedal = new Medal();
    firstMedal.setId(1L);
    Medal duplicateMedal = new Medal();
    duplicateMedal.setId(1L);
    traveler.decorate(firstMedal);
    traveler.decorate(duplicateMedal);
    Assertions.assertEquals(1, traveler.getMedals().size());
  }
}
