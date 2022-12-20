package com.example.demo;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MarqueService {
    @Autowired
    MarqueRepo mr;
    public ArrayList <Marque> getAll(){
        ArrayList<Marque> m = new ArrayList<Marque>();
        for(Marque mrq : mr.findAll()){
            m.add(mrq);
        }
        return m;
    }
}
