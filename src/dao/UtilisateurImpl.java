package dao;

import entities.Role;
import entities.Utilisateur;

import java.security.MessageDigest;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UtilisateurImpl implements IUtilisateur{
    private BD bd=new BD();
    private ResultSet result;
    private int ok;
    @Override
    public int Create(Utilisateur u) {
        String sql="INSERT INTO user values(NULL,?,?,?,?)";
        try{
            bd.initprepar(sql);
            //passage de valeur user
            bd.getPstm().setString(1,u.getEmail());
            bd.getPstm().setString(2,u.getPassword());
            bd.getPstm().setString(3,hashPassword(u.getPasswordhasted()));
            bd.getPstm().setInt(4,u.getIdR());

            //if (role!=null){
              //  int RoleId=role.getId();
               // bd.getPstm().setInt(4,RoleId);
            //}
            ok=bd.executeMAJ();
            bd.closeConnexion();
            //bd.getPstm().set
        }catch (Exception e){
            e.printStackTrace();
        }
        return ok;
    }

    @Override
    public List<Utilisateur> list() {
        List<Utilisateur> utilisateurs =new ArrayList<>();
        //String sql ="SELECT * FROM user u JOIN role r ON u.idRole = r.idRole";
        String sql = "SELECT * FROM user";
        try{
            bd.initprepar(sql);
            result = bd.executeSelect();
            while (result.next()){
                Utilisateur util = new Utilisateur();
                util.setId(result.getInt("id"));
                util.setEmail(result.getString("email"));
                Role role = new Role();
                role.setId(result.getInt("idRole"));
               // role.setNom(result.getString("nom"));
                util.setId(role.getId());
                util.setRole(role);
                utilisateurs.add(util);

            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return utilisateurs;
    }

    @Override
    public void showUser(List<Utilisateur> us) {
        us.forEach(utilisateur -> {
            System.out.println("Email : "+utilisateur.getEmail());
            System.out.println("ID : "+utilisateur.getId());
        });
    }

    @Override
    public Utilisateur get(int id) {
        return null;
    }

    @Override
    public int update(Utilisateur u) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }
    @Override
    public void ajouterUser(IUtilisateur iUtilisateur) {

        Utilisateur user=new Utilisateur();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donnez les information de l'utilisateurs:");
        System.out.println("Donnez l'email");
        user.setEmail(scanner.nextLine());
        System.out.println("Saisir le mot de passe");
        user.setPassword(scanner.nextLine());
        System.out.println("le mot de passe hasted");
        user.setPasswordhasted(user.getPasswordhasted() );
        System.out.println("id role");
        user.setIdR(scanner.nextInt());
        int ok = iUtilisateur.Create(user);
        if (ok == 1)
            System.out.println("good");
        else
            System.out.println("ppppp");

    }

        public  String hashPassword(String password) throws Exception {
            // Get an instance of the MD5 message digest
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Update the message digest with the password
           // md.update(password.getBytes());

            // Get the digest of the password
            byte[] digest = md.digest();

            // Convert the digest to a string
            return new String(digest);
        }

    }

