package com.juand.proyectoSpring.controllers;

import com.juand.proyectoSpring.models.Permiso;
import com.juand.proyectoSpring.models.User;
import com.juand.proyectoSpring.services.PermisoService;
import com.juand.proyectoSpring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("permiso")
public class PermisoController {

    @Autowired
    PermisoService permisoService;

    //Trae todos los permisos
    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Permiso> getAll(){
        return permisoService.getAll();
    }

    //Trae un permiso
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Permiso get(@PathVariable long id){
        return permisoService.get(id);
    }

    //Registrar permiso
    @RequestMapping(value = "/", method = RequestMethod.POST)
    Permiso register(@RequestBody Permiso permiso){
        return permisoService.register(permiso);
    }

    //Actualizar permiso
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    Permiso update(@RequestBody Permiso permiso){
        return permisoService.update(permiso);
    }

    //Eliminar permiso
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable long id){
        permisoService.delete(id);
    }

}
