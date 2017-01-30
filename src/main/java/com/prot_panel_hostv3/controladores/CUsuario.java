/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prot_panel_hostv3.controladores;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
/**
 *
 * @author Edgar
 */
@ViewScoped
@ManagedBean(name = "cUsuario")
@SessionScoped
@RequestScoped

public class CUsuario implements Serializable {

       public CUsuario() {
        
        CargarGrupos();
        cargarUsuariosPag();
    }

    public void CargarGrupos() {
    }

    private void cargarUsuariosPag() {
    }

    public void CargarUsuarios() {
    }

    public String generar_pass()
    {
        return "";
    }

    public void ingresar_usuario() {
        
    }
       
    public void modificar_usuario() {

    }

}
