package entities;

import java.util.Scanner;

public class Role {
    private int id;
    private String nom;
    private RoleUser role;

    public Role() {
    }

    public Role(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void SaisieR() {



    }

    public void afficheR() {
        System.out.println("Role :" + role);

    }
}
