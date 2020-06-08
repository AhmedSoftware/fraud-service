package com.ahmedsoftware.fraudservice;

import com.ahmedsoftware.fraudservice.controller.FraudController;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@ActiveProfiles("test")
@SpringBootTest(classes = FraudServiceApplication.class)
@RunWith(SpringRunner.class)
@AutoConfigureMessageVerifier
public class BaseClass {
    
    @Autowired
    FraudController fraudController;
    
    @Before
    public void setup(){
        RestAssuredMockMvc.standaloneSetup(fraudController);
    }
    
    public void triggerMessage(){
      this.fraudController.message();
    }
    
}
