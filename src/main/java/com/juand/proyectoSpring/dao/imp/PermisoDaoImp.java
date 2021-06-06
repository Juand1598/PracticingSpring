package com.juand.proyectoSpring.dao.imp;

import com.juand.proyectoSpring.dao.PermisoDao;
import com.juand.proyectoSpring.models.Permiso;
import com.juand.proyectoSpring.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class PermisoDaoImp implements PermisoDao {

    @PersistenceContext
    protected EntityManager entityManager;

    @Transactional
    @Override
    public List<Permiso> getAll(){
        String hql = "FROM Permiso as p";
        return (List<Permiso>) entityManager.createQuery(hql).getResultList();
    }

    @Transactional
    @Override
    public Permiso get(long id){
        return entityManager.find(Permiso.class, id);
    }

    @Transactional
    @Override
    public Permiso register(Permiso permiso){
        entityManager.merge(permiso);
        return permiso;
    }

    @Transactional
    @Override
    public Permiso update(Permiso permiso){
        entityManager.merge(permiso);
        return permiso;
    }

    @Transactional
    @Override
    public void delete(long id){
        Permiso permiso = this.get(id);
        entityManager.remove(permiso);
    }
}
