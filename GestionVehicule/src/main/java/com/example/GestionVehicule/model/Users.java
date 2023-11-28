package com.example.GestionVehicule.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Users")
public class Users {
    @Id
    @Column(name = "iduser")
    int idUser;
    @Column(name = "mail")
    String mail;
    @Column(name = "mdp")
    String mdp;

    public Users() {
    }

    public Users(int idUser, String mail, String mdp) {
        this.idUser = idUser;
        this.mail = mail;
        this.mdp = mdp;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
