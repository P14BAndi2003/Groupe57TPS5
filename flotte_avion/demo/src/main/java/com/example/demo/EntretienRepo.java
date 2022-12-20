package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface EntretienRepo  extends JpaRepository<Entretien,Integer>{
    List<Entretien> findByavion(Avion v);
    List<Entretien> findBytypeE(TypeEntretien t);

}
