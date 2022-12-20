package com.example.demo;
import java.time.LocalDate;

import javax.persistence.*;



import lombok.NoArgsConstructor;
@Entity
@Table(name = "Avion")
@NoArgsConstructor

public class Avion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_Avion", nullable=false)
    private int idAvion;

    @Column(name="immatriculation", nullable=false)
    private String immatriculation;
    

    @Column(name = "fin_Assurance")
    private LocalDate assuranceF;

    @Column(name = "photo")
    private String photo;
    public int getidAvion(){
        return idAvion;
    }
    public String getimmatriculation(){
        return immatriculation;
    }
   
    public void setidAvion(int id){
        idAvion=id;
    }
    public void setimmatriculation(String imm) {
        immatriculation=imm;
    }
   
    public LocalDate getAssuranceF(){
        return assuranceF;
    }
    public void setassuranceF(LocalDate af){
        assuranceF=af;
    }
    public String getPhoto(){
        return photo;
    }
    public void setPhoto(String phot){
        photo=phot;
    }

}
