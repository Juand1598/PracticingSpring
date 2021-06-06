package com.juand.proyectoSpring.controllers;

import com.juand.proyectoSpring.models.Role;
import com.juand.proyectoSpring.models.User;
import com.juand.proyectoSpring.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("role")
public class RoleController {

    @Autowired
    RoleService roleService;

    //Trae todos los roles
    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Role> getAll(){
        return roleService.getAll();
    }

    //Trae un rol
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Role get(@PathVariable long id){
        return roleService.get(id);
    }

    //Registrar rol
    @RequestMapping(value = "/", method = RequestMethod.POST)
    Role register(@RequestBody Role role){
        return roleService.register(role);
    }

    //Actualizar rol
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    Role update(@RequestBody Role role){
        return roleService.update(role);
    }

    //Eliminar rol
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable long id){
        roleService.delete(id);
    }
}
