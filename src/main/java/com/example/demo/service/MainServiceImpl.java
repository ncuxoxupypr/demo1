package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService {


    @Override
    public String getString() {
        String stroka = "Hello world";
        return stroka;
    }
}
