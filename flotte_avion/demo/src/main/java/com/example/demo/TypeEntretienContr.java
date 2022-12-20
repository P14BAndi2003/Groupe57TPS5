package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TypeEntretienContr {
    @Autowired
    TypeEntretienServ ts;
    @GetMapping("/tE")
    public ArrayList<TypeEntretien> liste(){

        return ts.getAll();
    }
}
