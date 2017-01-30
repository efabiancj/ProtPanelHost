/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EspecificacionesPruebas;

import com.prot_panel_hostv3.logica.clases.Aplicacion;
import com.prot_panel_hostv3.logica.clases.BasesDatos;
import com.prot_panel_hostv3.logica.clases.Usuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Edgar
 */
public class Prot_panel_hostIT {
    
    public Prot_panel_hostIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of crear_nuevo_usuario_cliente method, of class Prot_panel_host.
     */
    @Test
    public void testCrear_nuevo_usuario_cliente() {
        System.out.println("crear_nuevo_usuario_cliente");
        Usuario usuario = null;
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
      //  int result = instance.crear_nuevo_usuario_cliente(usuario);
      //  assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subir_proyecto method, of class Prot_panel_host.
     */
    @Test
    public void testSubir_proyecto() {
        System.out.println("subir_proyecto");
        Usuario usuario = null;
        String nombre_aplicacion = "";
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.subir_proyecto(usuario, nombre_aplicacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificar_proyecto method, of class Prot_panel_host.
     */
    @Test
    public void testModificar_proyecto() {
        System.out.println("modificar_proyecto");
        Usuario usuario = null;
        String nombre_aplicacion = "";
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.modificar_proyecto(usuario, nombre_aplicacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar_aplicacion method, of class Prot_panel_host.
     */
    @Test
    public void testEliminar_aplicacion() {
        System.out.println("eliminar_aplicacion");
        Aplicacion aplicación = null;
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.eliminar_aplicacion(aplicación);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compilar_proyecto method, of class Prot_panel_host.
     */
    @Test
    public void testCompilar_proyecto() {
        System.out.println("compilar_proyecto");
        Aplicacion aplicación = null;
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.compilar_proyecto(aplicación);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desplegar_desde_servidor_web method, of class Prot_panel_host.
     */
    @Test
    public void testDesplegar_desde_servidor_web() {
        System.out.println("desplegar_desde_servidor_web");
        Aplicacion aplicacion = null;
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.desplegar_desde_servidor_web(aplicacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of autenticar_clientes method, of class Prot_panel_host.
     */
    @Test
    public void testAutenticar_clientes() {
        System.out.println("autenticar_clientes");
        String nombre = "";
        String clave = "";
        Prot_panel_host instance = new Prot_panel_host();
        boolean expResult = false;
        boolean result = instance.autenticar_clientes(nombre, clave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of autenticar_administradores method, of class Prot_panel_host.
     */
    @Test
    public void testAutenticar_administradores() {
        System.out.println("autenticar_administradores");
        String nombre = "";
        String clave = "";
        Prot_panel_host instance = new Prot_panel_host();
        boolean expResult = false;
        boolean result = instance.autenticar_administradores(nombre, clave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editar_cliente method, of class Prot_panel_host.
     */
    @Test
    public void testEditar_cliente() {
        System.out.println("editar_cliente");
        Usuario usuario = null;
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.editar_cliente(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crear_nueva_base_datos method, of class Prot_panel_host.
     */
    @Test
    public void testCrear_nueva_base_datos() {
        System.out.println("crear_nueva_base_datos");
        BasesDatos bd = null;
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.crear_nueva_base_datos(bd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restaurar_base_datos method, of class Prot_panel_host.
     */
    @Test
    public void testRestaurar_base_datos() {
        System.out.println("restaurar_base_datos");
        BasesDatos bd = null;
        Prot_panel_host instance = new Prot_panel_host();
        int expResult = 0;
        int result = instance.restaurar_base_datos(bd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of respaldar_base_datos method, of class Prot_panel_host.
     */
    @Test
    public void testRespaldar_base_datos() {
        System.out.println("respaldar_base_datos");
        BasesDatos bd = null;
        Prot_panel_host instance = new Prot_panel_host();
        String expResult = "";
        String result = instance.respaldar_base_datos(bd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visualizar_consumo_recursos method, of class Prot_panel_host.
     */
    @Test
    public void testVisualizar_consumo_recursos() {
        System.out.println("visualizar_consumo_recursos");
        Usuario usuario = null;
        Prot_panel_host instance = new Prot_panel_host();
        String expResult = "";
        String result = instance.visualizar_consumo_recursos(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visualizar_aplicaciones method, of class Prot_panel_host.
     */
    @Test
    public void testVisualizar_aplicaciones() {
        System.out.println("visualizar_aplicaciones");
        Usuario usuario = null;
        Prot_panel_host instance = new Prot_panel_host();
        String expResult = "";
        String result = instance.visualizar_aplicaciones(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visualizar_bases_datos method, of class Prot_panel_host.
     */
    @Test
    public void testVisualizar_bases_datos() {
        System.out.println("visualizar_bases_datos");
        Usuario usuario = null;
        Prot_panel_host instance = new Prot_panel_host();
        String expResult = "";
        String result = instance.visualizar_bases_datos(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visualizar_dominios method, of class Prot_panel_host.
     */
    @Test
    public void testVisualizar_dominios() {
        System.out.println("visualizar_dominios");
        Usuario usuario = null;
        Prot_panel_host instance = new Prot_panel_host();
        String expResult = "";
        String result = instance.visualizar_dominios(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visualizar_codigo method, of class Prot_panel_host.
     */
    @Test
    public void testVisualizar_codigo() {
        System.out.println("visualizar_codigo");
        Usuario usuario = null;
        Aplicacion aplicacion = null;
        String archivo = "";
        Prot_panel_host instance = new Prot_panel_host();
        String expResult = "";
        String result = instance.visualizar_codigo(usuario, aplicacion, archivo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
