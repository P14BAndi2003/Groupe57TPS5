package com.example.demo;
import java.time.LocalDate;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.NoArgsConstructor;

import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@Table(name = "Entretien")
@NoArgsConstructor
@CrossOrigin
public class Entretien {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_entretien", nullable=false)
    private int idEntretien;

    public int getIdEntretien() {
        return idEntretien;
    }

    public void setIdEntretien(int idEntretien) {
        this.idEntretien = idEntretien;
    }

    @ManyToOne(targetEntity = TypeEntretien.class)
    @JoinColumn(name = "id_type",referencedColumnName = "id_type")
    private TypeEntretien typeE;

    public TypeEntretien getTypeE() {
        return typeE;
    }

    public void setTypeE(TypeEntretien idType) {
        this.typeE = idType;
    }

    
    @ManyToOne(targetEntity = Avion.class)
    @JoinColumn(name = "id_Avion",referencedColumnName = "id_Avion")
    private Avion avion;

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion id_Avion) {
        this.avion = id_Avion;
    }

    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
