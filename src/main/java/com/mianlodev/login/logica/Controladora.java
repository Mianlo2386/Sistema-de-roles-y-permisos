package com.mianlodev.login.logica;

import com.mianlodev.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    //public Controladora() {
    //   controlPersis = new ControladoraPersistencia();
    //}
    
    

    public String validarUsuario(String usuario, String contrasenia) {
        
        String mensaje = "";
        
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        
        for(Usuario usu : listaUsuarios){
            
            if(usu.getNombreUsuario().equals(usuario)){                
                
                if(usu.getContraseña().equals(contrasenia)){
                                       
                   mensaje = "Usuario y contraseña correctos.\nBienvenido/a!";
                   return mensaje;
                }
                else{
                    mensaje = "Contraseña incorrecta.";
                    return mensaje;
                }
            }
            else{
                mensaje = "Usuario inválido.";
            }
        }
        return mensaje;
    }
    
}
