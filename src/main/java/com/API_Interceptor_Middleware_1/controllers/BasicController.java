package com.API_Interceptor_Middleware_1.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/time")
public class BasicController {
    @GetMapping("/currentdatetime")
    public ResponseEntity<String> getCurrentDateTime(){
        String currentDateTime = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
        return ResponseEntity.ok().body(currentDateTime);
    }

}
