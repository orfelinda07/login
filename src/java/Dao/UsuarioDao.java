/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Utils.HibernateUtil;
import modelo.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author ORFELINDA
 */
public class UsuarioDao {

    public Usuario getUsuarioByUsername(String username) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Usuario where username='"+username+"'";
        Query query = session.createQuery(hql);
        Usuario usuario = (Usuario)query.uniqueResult();
        return usuario;
    }

}
