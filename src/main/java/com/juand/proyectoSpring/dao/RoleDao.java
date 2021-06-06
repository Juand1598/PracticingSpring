package com.juand.proyectoSpring.dao;

import com.juand.proyectoSpring.models.Role;
import com.juand.proyectoSpring.models.User;

import java.util.List;

public interface RoleDao {
    List<Role> getAll();
    Role get(long id);
    Role register(Role role);
    Role update(Role role);
    void delete(long id);

}
