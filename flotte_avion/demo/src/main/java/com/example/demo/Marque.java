package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;

import lombok.NoArgsConstructor;

@Entity
@Table(name = "marque")
@NoArgsConstructor
public class Marque {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_marque", nullable=false)
    private int id_Marque;

    @Column(name = "marque", nullable=false)
    private String marque;
    public int getId() {
        return id_Marque;
    } 
    public void setId(int id) {
        id_Marque=id;
    }
    public String getMarque() {
        return marque;
    }
    public void setMarque(String s){
        marque=s;
    }
}
