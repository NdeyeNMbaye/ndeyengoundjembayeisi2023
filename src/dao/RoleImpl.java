package dao;

import entities.Role;
import entities.Utilisateur;

import java.sql.ResultSet;
import java.util.List;

public class RoleImpl implements IRole {
private  BD db=new BD();
private ResultSet resultSet;
private  int ok;

    @Override
    public int Create(Role r) {
        String sql = "INSERT INTO role values(NULL,?)";
        try {
            db.initprepar(sql);
            //passage de valeur
            db.getPstm().setString(1, r.getNom());
            ok=db.executeMAJ();
            db.closeConnexion();;
        } catch (Exception e) {
            e.printStackTrace();
            //
        }

        return ok;
    }

    @Override
    public List<Role> list() {
        return null;
    }

    @Override
    public Role get(int id) {
        return null;
    }

    @Override
    public int update(Role r) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }
}

