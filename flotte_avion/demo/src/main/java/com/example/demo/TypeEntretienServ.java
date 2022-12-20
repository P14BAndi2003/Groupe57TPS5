package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeEntretienServ {
    @Autowired
    TypeEntretienRepo ter;
    
    public ArrayList<TypeEntretien> getAll(){
        ArrayList<TypeEntretien> liste=new ArrayList<>();
        for(TypeEntretien e :ter.findAll()){
            liste.add(e);
        }

        return liste;
    }
}
