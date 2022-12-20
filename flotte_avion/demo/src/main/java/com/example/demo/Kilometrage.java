package com.example.demo;

import java.time.LocalDate;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.NoArgsConstructor;

@Entity
@Table(name = "Kilometrage")
@NoArgsConstructor
@CrossOrigin
public class Kilometrage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_kilometrage", nullable=false)
    private int idkm;

    @ManyToOne(targetEntity = Avion.class)
    @JoinColumn(name = "id_Avion",referencedColumnName = "id_Avion")
    private Avion avion;

    @Column(name = "date", nullable=false)
    private LocalDate date;

    @Column(name = "debutkm" , nullable=false)
    private Float debut;

    @Column(name = "finkm" , nullable=false)
    private Float fin;


    public int getddkm(){
        return this.idkm;
    }
    public void setidkm(int i){
        idkm=i;
    }
    public Avion getavion(){
        return avion;
    }
    public void setavion(Avion v){
        avion=v;
    }
    public LocalDate getdate(){
        return this.date;
    }
    public void setdate(LocalDate i){
        date=i;
    }
    public Float getdebut(){
        return this.debut;
    }
    public void setdebut(Float i){
        debut=i;
    }
    public Float getfin(){
        return this.fin;
    }
    public void setfin(Float i){
        fin=i;
    }
    
}
