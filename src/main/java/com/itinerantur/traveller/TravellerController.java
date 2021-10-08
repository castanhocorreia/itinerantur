package com.itinerantur.travel.traveller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/traveller")
@RestController
public class TravellerController {
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    private final TravellerRepository repository;

    public TravellerController(TravellerRepository repository) {
        this.repository = repository;
    }
}
