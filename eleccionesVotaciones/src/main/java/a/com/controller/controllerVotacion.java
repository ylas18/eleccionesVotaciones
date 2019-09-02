/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.com.controller;

import a.com.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Yesid
 */
@ManagedBean(name = "controllerVotacion")
@ApplicationScoped
public class controllerVotacion {

    Usuario usu = new Usuario();
    private List<Usuario> lista = new ArrayList();
    
    public Usuario getUsu() {
        return usu;
    }

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }

    public List<Usuario> getLista() {
        lista = usu.listar();
        return lista;
    }

    public void setLista(List<Usuario> lista) {
        this.lista = lista;
    }

}
