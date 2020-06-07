package com.ahmedsoftware.fraudservice.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FraudController {
    
    @GetMapping(path = "/frauds")
    ResponseEntity<List<String>> fraud(){
        return ResponseEntity.status(201).body(Arrays.asList("ahmed","ali"));
    }
}
