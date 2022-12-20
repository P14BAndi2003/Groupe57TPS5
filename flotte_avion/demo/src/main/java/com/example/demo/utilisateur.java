package com.example.demo;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@Entity
@Table(name = "utilisateur")
@NoArgsConstructor
public class utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable=false)
    private int id;

    @Column(name = "nom", nullable=false)
    private String nom;

    @Column(name = "mdp", nullable=false)
    private String mdp;

    @Column(name = "token" , nullable=true,updatable = true)
    private String token;
    public String getNom(){
        return this.nom;
    }
    public String getMdp(){
        return this.mdp;
    }
    public String getToken(){
        return this.token;
    }
    public void setNom(String n){
        this.nom=n;
    }
    public void setMdp(String m){
        this.mdp=m;
    }
    public void setToken(String t){
        this.token=t;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
}
