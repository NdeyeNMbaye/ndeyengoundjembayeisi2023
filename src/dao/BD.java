package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BD {
    //mode de connexion
    private Connection connection;


    //resul requetes

    private ResultSet result;
    //requetes prepa

private PreparedStatement pstm;


    //requtes maj (3)
    private int ok;
    private void getConnection(){
        //param de connexion
        String url="jdbc:mysql://localhost:3306/gestionutilisateur";
        String user="root";
        String password="";
        try{
            //chargement du pilote
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection(url,user,password);
           // System.out.println("Connexion reussi!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //METHODE POUR OUVRIR LA CONNEXION AVEC LA BASE+
    public void initprepar(String sql){
        try {
            getConnection();
            //preparer la requete
            pstm=connection.prepareStatement(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public ResultSet executeSelect(){
        result=null;
        try {
            result=pstm.executeQuery();
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
    //LA METHODE DE L'excecution
    public int executeMAJ(){
        try{
            ok=pstm.executeUpdate();
        }catch (Exception e){
e.printStackTrace();
        }
        return ok;
    }
    //close connexion
    public void closeConnexion (){
        try {
            if (connection!=null)
                connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //get

    public PreparedStatement getPstm() {
        return pstm;
    }
}
