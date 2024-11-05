package com.mianlodev.login.persistencia;

import com.mianlodev.login.logica.Rol;
import com.mianlodev.login.logica.Usuario;
import java.util.List;

public class ControladoraPersistencia {
    
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    RolJpaController rolJpa = new RolJpaController();

    public List<Usuario> traerUsuarios() {
        return usuJpa.findUsuarioEntities(); //SELECT * FROM USUARIOS
    }

    public List<Rol> traerRoles() {
        return rolJpa.findRolEntities(); //SELECT * FROM ROLES
    }

    public void crearUsuario(Usuario usu) {
        usuJpa.create(usu);
    }
}
