package main;

import dao.*;
import entities.Role;
import entities.RoleUser;
import entities.Utilisateur;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //System.out.println("");
        //IRole irole=new RoleImpl();
        //  Role r=new Role();
        // r.setNom("admin");
        //
        Scanner scanner = new Scanner(System.in);
       IUtilisateur iutilisateur = new UtilisateurImpl();
       Utilisateur u = new Utilisateur();

      //  u.setEmail("ndeyembaye@gmail.com");
      //  u.setPassword("sdfg");
      //  u.setPasswordhasted("qsdfgh");
       // u.setIdR(1);
        //------------------------------------------------------------------------------------------>
        // int existRol = iutilisateur.rechercheRole();
        // if (existRol != 1){
        //   Role role = new Role();
        //    role.setId(existRol);
        //   u.setIdR(role);
        // }

       iutilisateur.ajouterUser(iutilisateur);
       iutilisateur.list();
      //  private RoleUser role;

    }
}
