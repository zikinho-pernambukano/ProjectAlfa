package com.example.projectalfa.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping ("/currency")
@RestController
public class CurrencyController {

    @GetMapping("/picture/{currency}")
    public ResponseEntity<String> getPictureByCurrency(@PathVariable String currency) {




        return ResponseEntity.ok(currency);
    }


}
