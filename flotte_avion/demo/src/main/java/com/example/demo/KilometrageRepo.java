package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface KilometrageRepo extends JpaRepository<Kilometrage,Integer> {
    List<Kilometrage> findByAvion(Avion v);
}
