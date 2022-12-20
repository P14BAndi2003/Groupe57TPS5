package com.example.demo;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@CrossOrigin
public class KilometrageContr {
    @Autowired
    KilometrageService ks;

    @GetMapping("/infokm")
    public ArrayList<Kilometrage>rehetra(){
        return ks.izyrehetra();
    } 

    @GetMapping("/inforay")
    public ArrayList<Kilometrage>ray(@RequestParam  (value="idA") int idA){
        Avion v1=new Avion();
        v1.setidAvion(idA);
        return ks.specifique(v1);
    } 
}
