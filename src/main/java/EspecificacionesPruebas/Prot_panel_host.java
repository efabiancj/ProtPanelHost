package EspecificacionesPruebas;


import com.prot_panel_hostv3.logica.clases.Aplicacion;
import com.prot_panel_hostv3.logica.clases.BasesDatos;
import com.prot_panel_hostv3.logica.clases.Usuario;
import java.io.IOException;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edgar
 */
public class Prot_panel_host 
{
    //preuba de funciones (controladores)
    public int registro_cliente(Usuario usuario)
    {
       return 0;  
    }
    
    public int validacion_registro()
    {
        return 0;
    }
    public int subir_proyecto(Usuario usuario, String nombre_aplicacion)
    {
       return 0;
    }
    public int modificar_proyecto(Usuario usuario, String nombre_aplicacion)
    {
       return 0;
    }
    
    public int eliminar_aplicacion(Aplicacion aplicación)
    {
        return 0; 
    }
    
    public int compilar_proyecto(Aplicacion aplicación)
    {
        return 0;
    }
    
    
    public int desplegar_desde_servidor_web(Aplicacion aplicacion)
    {
        return 0;
    }
    
    public boolean autenticar_clientes(String nombre, String clave)
    {
        return false;
    }
    
    public boolean autenticar_administradores(String nombre, String clave)
    {   
        return false;
    }
    
    public int  editar_cliente(Usuario usuario)
    {
        return 0;
    }
    
    public int crear_nueva_base_datos(BasesDatos bd)
    {
        return 0; 
    }
    
    public int restaurar_base_datos(BasesDatos bd)
    {
        return 0;
    }
    
    public String respaldar_base_datos(BasesDatos bd)
    {
        return null;
    }
    
    public String  visualizar_consumo_recursos(Usuario usuario)
    {
        return null;
    }
    
    public String  visualizar_aplicaciones(Usuario usuario)
    {
        return null;
    }
    
    public String  visualizar_bases_datos(Usuario usuario)
    {
        return null;
    }
    
    public String  visualizar_dominios(Usuario usuario)
    {
        return null;
    }
    
    public String  reporte_usuarios()
    {
        return null;
    }
    
    public String  visualizar_codigo(Usuario usuario, Aplicacion aplicacion, String archivo)
    {
        return null;
    }
    
}
