package com.example.GestionVehicule.model;

public class Voiture {
    String erreur;
    Data[] data;

    public Data[] getData() {
        return data;
    }

    public void setData(VoitureBase[] vbase) throws Exception {
        Data date = new Data();
        this.data = date.implementData(vbase);
    }
    public String getErreur() {
        return erreur;
    }

    public void setErreur(String erreur) {
        this.erreur = erreur;
    }
}
