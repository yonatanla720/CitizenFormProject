package com.example.project1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class DefaultController {

    @RequestMapping("/**")
    public ResponseEntity<String> handleDefaultRoute(){
        String errorMessage = "The requested resource was not found.";
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
    }
}
