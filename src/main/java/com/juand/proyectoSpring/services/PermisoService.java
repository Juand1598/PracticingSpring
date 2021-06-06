package com.juand.proyectoSpring.services;

import com.juand.proyectoSpring.dao.PermisoDao;
import com.juand.proyectoSpring.dao.UserDao;
import com.juand.proyectoSpring.models.Permiso;
import com.juand.proyectoSpring.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermisoService {

    @Autowired
    PermisoDao permisoDao;

    public List<Permiso> getAll(){
        return permisoDao.getAll();
    }

    public Permiso get( long id){
        return permisoDao.get(id);
    }

    public Permiso register(Permiso permiso){
        return permisoDao.register(permiso);
    }

    public Permiso update(Permiso permiso){
        return permisoDao.update(permiso);
    }

    public void delete(long id){
        permisoDao.delete(id);
    }
}
