package com.ahmedsoftware.fraudservice.controller;


import com.ahmedsoftware.fraudservice.pojo.Fraud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

@RestController
public class FraudController {
    
    
    private final Source source;
    
    public FraudController(Source source) {
        this.source =source;
    }
    
    @GetMapping(path = "/fraud")
    ResponseEntity<List<String>> fraud(){
        return ResponseEntity.status(201).body(Arrays.asList("ahmed","ali"));
    }
    
    @PostMapping(path = "/message")
    public void message(){
        this.source.output().send(MessageBuilder.withPayload(new Fraud("sinkMessage")).build());
    }
}
