package com.pucp.lab020252.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class PetController {
    @GetMapping("/pets")
    public String getPets() {
        log.info("Feat 1: Fetching pets");
        return "pets";
    }
}
