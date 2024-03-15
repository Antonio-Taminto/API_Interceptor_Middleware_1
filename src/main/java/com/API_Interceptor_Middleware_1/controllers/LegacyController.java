package com.API_Interceptor_Middleware_1.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/legacy")
public class LegacyController {
    @GetMapping("/oldcode")
    public ResponseEntity<String> getOldCode(){
        String oldCode = "This is just old code";
        return ResponseEntity.ok().body(oldCode);
    }
}
