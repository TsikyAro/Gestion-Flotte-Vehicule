package com.example.GestionVehicule.model;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Data {
    String nom;
    String donnes;

    public Data() {
    }

    public Data[] implementData(VoitureBase[] voiture) throws Exception {
        ArrayList<Data> data = new ArrayList<Data>();
        Field[] file = voiture[0].getClass().getDeclaredFields();
        for (int i = 0; i < voiture.length; i++) {
            for (int j = 0; j < file.length ; j++) {
                Method method = voiture[i].getClass().getDeclaredMethod("get"+toMaj(file[j].getName()));
                String result = method.invoke(voiture[i]).toString();
                Data date = new Data(file[j].getName(),result);
                data.add(date);
                System.out.println(date.getNom()+" donne "+ date.getDonnes()+"  "+j);
            }
        }
        return  data.toArray(new Data[data.size()]);
    }
    public String toMaj(String mot){
        return mot.substring(0,1).toUpperCase() + mot.substring(1);
    }
    public Data(String nom, String donnes) {
        this.nom = nom;
        this.donnes = donnes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDonnes() {
        return donnes;
    }

    public void setDonnes(String donnes) {
        this.donnes = donnes;
    }
}
