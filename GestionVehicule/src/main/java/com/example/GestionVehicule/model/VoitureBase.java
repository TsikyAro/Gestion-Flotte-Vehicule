package com.example.GestionVehicule.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Voiture")
public class VoitureBase {
    @Id
    @Column(name = "idvoiture")
    int idVoiture;
    @Column(name = "matricule")
    String matricule;

    public VoitureBase() {
    }

    public VoitureBase(int idVoiture, String matricule) {
        this.idVoiture = idVoiture;
        this.matricule = matricule;
    }

    public int getIdVoiture() {
        return idVoiture;
    }

    public void setIdVoiture(int idVoiture) {
        this.idVoiture = idVoiture;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
}
