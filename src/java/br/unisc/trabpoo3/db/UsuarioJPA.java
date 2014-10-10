/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisc.trabpoo3.db;

import br.unisc.trabpoo3.model.Usuario;
import br.unisc.trabpoo3.util.Utils;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author tauame
 */
public class UsuarioJPA {
    EntityManager em;
    
    public UsuarioJPA(){
        this.em = Utils.getEM();
    }
    
    public UsuarioJPA(EntityManager entityManager){
        this.em = entityManager;
    }
    
    public void inserir(Usuario usuario){
        this.em.persist(usuario);
    }
    
    public Usuario buscaLoginSenha(String login, String senha){
        Query query = em.createQuery("select u from Usuario u where u.login = :login AND u.senha = :senha");
        query.setParameter("login", login);
        query.setParameter("senha", senha);
        try{
            return (Usuario) query.getSingleResult();
        }catch(Exception e){
            return null;
        }
    }
    
    public List<Usuario> listar(){
        Query query = em.createQuery("select u from Usuario u");
        return query.getResultList();
    }
    
    public void deletar(Usuario usuario){
        Query query = em.createQuery("delete from Usuario u where u.id = :idUsuario");
        query.setParameter("idUsuario", usuario.getId());
        query.executeUpdate();
    }
    
    public void atualizar(Usuario usuario){
        Usuario usuarioBanco = em.find(Usuario.class, usuario.getId());
        em.getTransaction().begin();
        Utils.clone(usuario, usuarioBanco);
        em.getTransaction().commit();
    }
}

