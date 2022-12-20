package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

@Service
public class AvionServ {
    @Autowired 
    AvionRep vRep;

    public ArrayList<Avion> getAll(){
        ArrayList<Avion> LAvion = new ArrayList<Avion>();
        for(Avion Av : vRep.findAll()){
            LAvion.add(Av);
        }
        return LAvion;
    }
    public void ajouter(Avion v){
        vRep.save(v);
    }
    public ArrayList<Avion> getoneMonth(){
        ArrayList<Avion> all=this.getAll();
        ArrayList<Avion> v=new ArrayList<>();

        for(int i=0;i<all.size();i++){
            LocalDate ass=all.get(i).getAssuranceF();
            double duree=LocalDate.now().until(ass,ChronoUnit.MONTHS);
            if(duree>-1.0&&duree<1.0){
                v.add(all.get(i));
            }

        }
        return v;
    }
    public ArrayList<Avion> getthreeMonth(){
        ArrayList<Avion> all=this.getAll();
        ArrayList<Avion> v=new ArrayList<>();

        for(int i=0;i<all.size();i++){
            LocalDate ass=all.get(i).getAssuranceF();
            double duree=LocalDate.now().until(ass,ChronoUnit.MONTHS);
            if(duree>0.0&&duree<=3.0){
                v.add(all.get(i));
            }

        }
        return v;
    }
}
