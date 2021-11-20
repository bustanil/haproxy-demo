package com.bustanilarifin.haproxy.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Value("${server.port:8080}")
    private Integer serverPort;

    @GetMapping("/hello")
    public ResponseEntity<?> sayHello(){
        return ResponseEntity.ok("Hello from " + serverPort);
    }

}
