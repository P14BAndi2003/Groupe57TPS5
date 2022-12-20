package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@CrossOrigin
public class EntretienContr {
    @Autowired
    EntretienService es;

    @GetMapping("/entretiens")
    public ArrayList<Entretien>ListAll(){
        return es.listertout();
    }

    @GetMapping("/entretienAvion")
    public ArrayList<Entretien>listparAvion(@RequestParam  (value="idA") int idA){
        Avion a=new Avion();
        a.setidAvion(idA);
        return es.listEavion(a);
    }

    @GetMapping("/entretien")
    public ArrayList<Entretien>listparEntretien(@RequestParam  (value="idT") int idT){
        TypeEntretien t=new TypeEntretien();
        t.setIdtype(idT);
        return es.listByE(t);
    }

}
