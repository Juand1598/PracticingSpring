package com.juand.proyectoSpring.dao;

import com.juand.proyectoSpring.models.Permiso;
import com.juand.proyectoSpring.models.User;

import java.util.List;


public interface PermisoDao {

    List<Permiso> getAll();
    Permiso get(long id);
    Permiso register(Permiso permiso);
    Permiso update(Permiso permiso);
    void delete(long id);

}
