package com.example.demo.controller;

import com.example.demo.service.MainService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class MainController {

    private final MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }


    @GetMapping(value = "/string")
    public ResponseEntity<String> getString() {

        return ResponseEntity.ok(mainService.getString());
    }
}
