package org.example.controllers;

import org.example.models.Registration;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegController {
    @GetMapping("/registration")
    public String GetReg() {
        return "Hello from your API";
    }
    @CrossOrigin
    @PostMapping("/reg_form")
    public String PostReg(@RequestBody Registration registration) {
        System.out.printf("saving %s", registration);
        return registration.getEmail();
    }
}

