package entities;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utilisateur {

  private  int idR;

    private  int id;
    private String email;
    private String password;
    private String passwordhasted;
    private Role role;
    private List<String> utilisateur=new ArrayList<>();
//CONSTRUCTEUR SANS ARG
    public Utilisateur() {

    }
    //CONSTRUCTEUR AVEC ARG

    public Utilisateur(int id, String email, String password, String passwordhasted) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.passwordhasted = passwordhasted;
    }
    //GTTEURS AND SETTEURS



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordhasted() {
        return passwordhasted;
    }

    public void setPasswordhasted(String passwordhasted) {

        this.passwordhasted = passwordhasted;
    }

    public int getIdR() {
        return idR;
    }

    public void setIdR(int idR) {
        this.idR = idR;
    }
    /*public  void SaisieU(){
        Utilisateur user=new Utilisateur();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donnez les information de l'utilisateurs:");
        System.out.println("Donnez l'email");
        email = scanner.nextLine();
        System.out.println("Saisir le mot de passe");
        password = scanner.nextLine();
        System.out.println("Saisir le mot de passe hassed");
        passwordhasted = scanner.nextLine();
        ////recup des valeurs
        user.setEmail(email);
        user.setIdR(idR);
        user.setPassword(password);
        user.setPasswordhasted(passwordhasted);
    }*/
    ///
   /* public void AfficheP(){
        System.out.println("email"+email);
        System.out.println("Mot de passe"+password);
        System.out.println("Mot de passe hashe"+passwordhasted);


    }*/

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
