package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin
public class MarqueContr {
    @Autowired
    MarqueService ms;
    @GetMapping("/marques")
    public ArrayList<Marque> get(){
        return ms.getAll();

    }
}
