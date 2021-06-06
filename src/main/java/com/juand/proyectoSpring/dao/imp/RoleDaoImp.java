package com.juand.proyectoSpring.dao.imp;

import com.juand.proyectoSpring.dao.RoleDao;
import com.juand.proyectoSpring.models.Role;
import com.juand.proyectoSpring.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class RoleDaoImp implements RoleDao {

    @PersistenceContext
    protected EntityManager entityManager;

    @Transactional
    @Override
    public List<Role> getAll(){
        String hql = "FROM Role as r";
        return (List<Role>) entityManager.createQuery(hql).getResultList();
    }

    @Transactional
    @Override
    public Role get(long id){
        return entityManager.find(Role.class, id);
    }

    @Transactional
    @Override
    public Role register(Role role){
        entityManager.merge(role);
        return role;
    }

    @Transactional
    @Override
    public Role update(Role role){
        entityManager.merge(role);
        return role;
    }

    @Transactional
    @Override
    public void delete(long id){
        Role role = this.get(id);
        entityManager.remove(role);
    }
}
