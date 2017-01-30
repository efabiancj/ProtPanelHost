package com.prot_panel_hostv3.logica.clases;
// Generated 02/10/2016 21:23:21 by Hibernate Tools 4.3.1

import com.prot_panel_hostv3.logica.clases.Usuario;




/**
 * Aplicacion generated by hbm2java
 */
public class Aplicacion  implements java.io.Serializable {


     private int id;
     private Dominio dominio;
     private Usuario usuario;
     private String nombre;
     private Integer usuario_1;
     private String directorio;
     private String archivoWar;

    public Aplicacion() {
    }

	
    public Aplicacion(Usuario usuario) {
        this.usuario = usuario;
    }
    public Aplicacion(Dominio dominio, Usuario usuario, String nombre, Integer usuario_1, String directorio, String archivoWar) {
       this.dominio = dominio;
       this.usuario = usuario;
       this.nombre = nombre;
       this.usuario_1 = usuario_1;
       this.directorio = directorio;
       this.archivoWar = archivoWar;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Dominio getDominio() {
        return this.dominio;
    }
    
    public void setDominio(Dominio dominio) {
        this.dominio = dominio;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getUsuario_1() {
        return this.usuario_1;
    }
    
    public void setUsuario_1(Integer usuario_1) {
        this.usuario_1 = usuario_1;
    }
    public String getDirectorio() {
        return this.directorio;
    }
    
    public void setDirectorio(String directorio) {
        this.directorio = directorio;
    }
    public String getArchivoWar() {
        return this.archivoWar;
    }
    
    public void setArchivoWar(String archivoWar) {
        this.archivoWar = archivoWar;
    }




}

