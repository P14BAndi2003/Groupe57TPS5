package com.example.demo;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.NoArgsConstructor;

import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@Table(name = "typeentretien")
@NoArgsConstructor
@CrossOrigin
public class TypeEntretien {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_type", nullable=false)
    private int idtype;

    @Column(name = "type", nullable=false)
    private String type;

    public int getIdtype() {
        return idtype;
    }

    public void setIdtype(int idtype) {
        this.idtype = idtype;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
