package dao;

import entities.Role;


import java.util.List;

public interface IRole {
   public int Create(Role r);
   public List<Role>list();
public Role get(int id);
public int update(Role r);
public int delete(int id);
    // public int create()
}
