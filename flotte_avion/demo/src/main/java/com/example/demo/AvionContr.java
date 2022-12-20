package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
@CrossOrigin
public class AvionContr {
    @Autowired
    AvionServ vs;
    @GetMapping("/Avions")
    public ArrayList<Avion> getAllplane(){
        return vs.getAll();

    }
    @PostMapping("/Avion")
    public void insert(@RequestBody Avion v){
        vs.ajouter(v);
    }

    @GetMapping("/Assurance")
    public ArrayList<Avion> getAssurance(@RequestParam (value="filtre") int filtre){
        ArrayList<Avion> v=new ArrayList<>();
        if(filtre==1){
            v=vs.getoneMonth();
        }
        else if(filtre==3){
            v=vs.getthreeMonth();
        }
        return v;
    }
}
    