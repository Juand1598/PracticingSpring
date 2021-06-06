package com.juand.proyectoSpring.services;

import com.juand.proyectoSpring.dao.UserDao;
import com.juand.proyectoSpring.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<User> getAll(){
        return userDao.getAll();
    }

    public User get( long id){
        return userDao.get(id);
    }

    public User register(User user){
        return userDao.register(user);
    }

    public User update(User user){
        return userDao.update(user);
    }

    public void delete(long id){
        userDao.delete(id);
    }
}
