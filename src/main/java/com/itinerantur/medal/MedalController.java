package com.itinerantur.medal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/medal")
@RestController
public class MedalController {
  private final MedalRepository repository;

  public MedalController(MedalRepository repository) {
    this.repository = repository;
  }
}
