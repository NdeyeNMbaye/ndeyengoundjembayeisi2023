package dao;

import entities.Utilisateur;

import java.util.List;
import java.util.Scanner;

public interface IUtilisateur {
    public  int Create(Utilisateur u);
    //ajout user dans la base
    public List<Utilisateur>list();
    public  Utilisateur get(int id);
    public int update(Utilisateur u);
    public int delete(int id);
    public void ajouterUser(IUtilisateur iUtilisateur);
    //public  int rechercheRole();
}
