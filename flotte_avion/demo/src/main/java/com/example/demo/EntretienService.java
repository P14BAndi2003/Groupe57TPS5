package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntretienService {
    @Autowired
    EntretienRepo er;

    public ArrayList<Entretien> listertout(){
        ArrayList<Entretien> liste=new ArrayList<>();
        for(Entretien e :er.findAll()){
            liste.add(e);
        }
        return liste;
    }

    public ArrayList<Entretien> listEavion(Avion a){
        ArrayList<Entretien> liste=new ArrayList<>();
        for(Entretien e :er.findByavion(a)){
            liste.add(e);
        }
        return liste;
    }

    public ArrayList<Entretien> listByE(TypeEntretien a){
        ArrayList<Entretien> liste=new ArrayList<>();
        for(Entretien e :er.findBytypeE(a)){
            liste.add(e);
        }
        return liste;
    }
}
