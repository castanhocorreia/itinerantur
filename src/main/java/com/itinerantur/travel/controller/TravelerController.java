package com.itinerantur.travel.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TravelerController {
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
}
