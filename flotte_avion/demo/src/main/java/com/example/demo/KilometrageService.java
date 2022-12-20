package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KilometrageService {
    @Autowired
    KilometrageRepo rep;

    public ArrayList<Kilometrage> izyrehetra(){
        ArrayList<Kilometrage> v=new ArrayList<>();
        for(Kilometrage u :rep.findAll()){
            v.add(u);
        }
        return v;

    }
    public ArrayList<Kilometrage> specifique(Avion vv){
        ArrayList<Kilometrage> v=new ArrayList<>();
        for(Kilometrage u :rep.findByAvion(vv)){
            v.add(u);
        }
        return v;

    }
}
