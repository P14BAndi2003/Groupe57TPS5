package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TypeEntretienRepo extends JpaRepository<TypeEntretien,Integer> {
    
}
