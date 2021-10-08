package com.itinerantur.traveller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RequestMapping("/traveller")
@RestController
public class TravellerController {
  private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
  private final TravellerRepository repository;

  public TravellerController(TravellerRepository repository) {
    this.repository = repository;
  }

  @PostMapping
  public ResponseEntity<TravellerRepresentation> register(
      @RequestBody TravellerRegistration registration, UriComponentsBuilder builder) {
    Traveller traveller = registration.convert();
    repository.save(traveller);
    URI identifier = builder.path("/traveller/{id}").buildAndExpand(traveller.getId()).toUri();
    return ResponseEntity.created(identifier).body(new TravellerRepresentation(traveller));
  }
}
