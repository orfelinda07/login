/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Dao.UsuarioDao;
import modelo.Usuario;


public class Acceso {
    public Boolean autentificar(String username, String password){
        Boolean respuesta;
        UsuarioDao dao = new UsuarioDao();
        Usuario miUsuario = dao.getUsuarioByUsername(username);
        
        if(password.equals(miUsuario.getPassword())){
            respuesta = true;            
        }else{
            respuesta = false;
        }
        return respuesta;
    }
}
