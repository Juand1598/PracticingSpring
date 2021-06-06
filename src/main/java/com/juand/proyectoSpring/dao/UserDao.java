package com.juand.proyectoSpring.dao;

import com.juand.proyectoSpring.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserDao {

    List<User> getAll();
    User get(long id);
    User register(User user);
    User update(User user);
    void delete(long id);

}
