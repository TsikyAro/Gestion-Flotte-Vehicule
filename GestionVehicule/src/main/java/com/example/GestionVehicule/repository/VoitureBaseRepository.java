package com.example.GestionVehicule.repository;

import com.example.GestionVehicule.model.VoitureBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoitureBaseRepository  extends JpaRepository<VoitureBase,Integer> {
    List<VoitureBase> findAll();

}
