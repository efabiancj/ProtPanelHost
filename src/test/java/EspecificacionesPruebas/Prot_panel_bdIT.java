/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EspecificacionesPruebas;

import com.prot_panel_hostv3.logica.clases.Aplicacion;
import com.prot_panel_hostv3.logica.clases.BasesDatos;
import com.prot_panel_hostv3.logica.clases.Ciudad;
import com.prot_panel_hostv3.logica.clases.Dominio;
import com.prot_panel_hostv3.logica.clases.Usuario;
import java.util.ArrayList;
import logica.clases.Administrador;
import logica.clases.Grupo;
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
public class Prot_panel_bdIT {
    
    public Prot_panel_bdIT() {
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
     * Test of Existe_tabla_Aplicacion method, of class Prot_panel_bd.
     */
    @Test
    public void testExiste_tabla_Aplicacion() {
        System.out.println("Existe_tabla_Aplicacion");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Existe_tabla_Aplicacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Atributos_Aplicacion method, of class Prot_panel_bd.
     */
    @Test
    public void testAtributos_Aplicacion() {
        System.out.println("Atributos_Aplicacion");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Atributos_Aplicacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FK_Aplicacion method, of class Prot_panel_bd.
     */
    @Test
    public void testFK_Aplicacion() {
        System.out.println("FK_Aplicacion");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.FK_Aplicacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Compatibilidad_Aplicacion_tipo_PK_FK method, of class Prot_panel_bd.
     */
    @Test
    public void testCompatibilidad_Aplicacion_tipo_PK_FK() {
        System.out.println("Compatibilidad_Aplicacion_tipo_PK_FK");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Compatibilidad_Aplicacion_tipo_PK_FK();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Cardinalidad_Aplicacion_Foraneas method, of class Prot_panel_bd.
     */
    @Test
    public void testCardinalidad_Aplicacion_Foraneas() {
        System.out.println("Cardinalidad_Aplicacion_Foraneas");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Cardinalidad_Aplicacion_Foraneas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Comprobar_Aplicacion_PK_unico method, of class Prot_panel_bd.
     */
    @Test
    public void testComprobar_Aplicacion_PK_unico() {
        System.out.println("Comprobar_Aplicacion_PK_unico");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Comprobar_Aplicacion_PK_unico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Comprobar_Aplicacion_FK_PK_unico method, of class Prot_panel_bd.
     */
    @Test
    public void testComprobar_Aplicacion_FK_PK_unico() {
        System.out.println("Comprobar_Aplicacion_FK_PK_unico");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Comprobar_Aplicacion_FK_PK_unico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PK_Aplicacion_Debe_ser_tipo_entero_char_cadena method, of class Prot_panel_bd.
     */
    @Test
    public void testPK_Aplicacion_Debe_ser_tipo_entero_char_cadena() {
        System.out.println("PK_Aplicacion_Debe_ser_tipo_entero_char_cadena");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.PK_Aplicacion_Debe_ser_tipo_entero_char_cadena();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Existe_Indice_Aplicaición method, of class Prot_panel_bd.
     */
    @Test
    public void testExiste_Indice_Aplicaición() {
        System.out.println("Existe_Indice_Aplicaici\u00f3n");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Existe_Indice_Aplicaición();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Aplicacion_velocidad_consulta_indice method, of class Prot_panel_bd.
     */
    @Test
    public void testAplicacion_velocidad_consulta_indice() {
        System.out.println("Aplicacion_velocidad_consulta_indice");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Aplicacion_velocidad_consulta_indice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Aplicacion_Registros_obtenidos method, of class Prot_panel_bd.
     */
    @Test
    public void testAplicacion_Registros_obtenidos() {
        System.out.println("Aplicacion_Registros_obtenidos");
        Prot_panel_bd instance = new Prot_panel_bd();
        ArrayList<Aplicacion> expResult = null;
        ArrayList<Aplicacion> result = instance.Aplicacion_Registros_obtenidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Existe_tabla_BaseDatos method, of class Prot_panel_bd.
     */
    @Test
    public void testExiste_tabla_BaseDatos() {
        System.out.println("Existe_tabla_BaseDatos");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Existe_tabla_BaseDatos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Atributos_BaseDatos method, of class Prot_panel_bd.
     */
    @Test
    public void testAtributos_BaseDatos() {
        System.out.println("Atributos_BaseDatos");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Atributos_BaseDatos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FK_BaseDatos method, of class Prot_panel_bd.
     */
    @Test
    public void testFK_BaseDatos() {
        System.out.println("FK_BaseDatos");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.FK_BaseDatos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Compatibilidad_BaseDatos_tipo_PK_FK method, of class Prot_panel_bd.
     */
    @Test
    public void testCompatibilidad_BaseDatos_tipo_PK_FK() {
        System.out.println("Compatibilidad_BaseDatos_tipo_PK_FK");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Compatibilidad_BaseDatos_tipo_PK_FK();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Cardinalidad_BaseDatos_Fornaneas method, of class Prot_panel_bd.
     */
    @Test
    public void testCardinalidad_BaseDatos_Fornaneas() {
        System.out.println("Cardinalidad_BaseDatos_Fornaneas");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Cardinalidad_BaseDatos_Fornaneas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Comprobar_BaseDatos_PK_unico method, of class Prot_panel_bd.
     */
    @Test
    public void testComprobar_BaseDatos_PK_unico() {
        System.out.println("Comprobar_BaseDatos_PK_unico");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Comprobar_BaseDatos_PK_unico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Comprobar_BaseDatos_FK_PK_unico method, of class Prot_panel_bd.
     */
    @Test
    public void testComprobar_BaseDatos_FK_PK_unico() {
        System.out.println("Comprobar_BaseDatos_FK_PK_unico");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Comprobar_BaseDatos_FK_PK_unico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PK_BaseDatos_Debe_ser_tipo_entero_char_cadena method, of class Prot_panel_bd.
     */
    @Test
    public void testPK_BaseDatos_Debe_ser_tipo_entero_char_cadena() {
        System.out.println("PK_BaseDatos_Debe_ser_tipo_entero_char_cadena");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.PK_BaseDatos_Debe_ser_tipo_entero_char_cadena();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Existe_Indice_BaseDatos method, of class Prot_panel_bd.
     */
    @Test
    public void testExiste_Indice_BaseDatos() {
        System.out.println("Existe_Indice_BaseDatos");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Existe_Indice_BaseDatos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BaseDatos_velocidad_consulta_indice method, of class Prot_panel_bd.
     */
    @Test
    public void testBaseDatos_velocidad_consulta_indice() {
        System.out.println("BaseDatos_velocidad_consulta_indice");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.BaseDatos_velocidad_consulta_indice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BaseDatos_Registros_obtenidos method, of class Prot_panel_bd.
     */
    @Test
    public void testBaseDatos_Registros_obtenidos() {
        System.out.println("BaseDatos_Registros_obtenidos");
        Prot_panel_bd instance = new Prot_panel_bd();
        ArrayList<BasesDatos> expResult = null;
        ArrayList<BasesDatos> result = instance.BaseDatos_Registros_obtenidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Existe_tabla_Dominio method, of class Prot_panel_bd.
     */
    @Test
    public void testExiste_tabla_Dominio() {
        System.out.println("Existe_tabla_Dominio");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Existe_tabla_Dominio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Atributos_Dominio method, of class Prot_panel_bd.
     */
    @Test
    public void testAtributos_Dominio() {
        System.out.println("Atributos_Dominio");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Atributos_Dominio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FK_Dominio method, of class Prot_panel_bd.
     */
    @Test
    public void testFK_Dominio() {
        System.out.println("FK_Dominio");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.FK_Dominio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Compatibilidad_Dominio_tipo_PK_FK method, of class Prot_panel_bd.
     */
    @Test
    public void testCompatibilidad_Dominio_tipo_PK_FK() {
        System.out.println("Compatibilidad_Dominio_tipo_PK_FK");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Compatibilidad_Dominio_tipo_PK_FK();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Cardinalidad_Dominio_Fornaneas method, of class Prot_panel_bd.
     */
    @Test
    public void testCardinalidad_Dominio_Fornaneas() {
        System.out.println("Cardinalidad_Dominio_Fornaneas");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Cardinalidad_Dominio_Fornaneas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Comprobar_Dominio_PK_unico method, of class Prot_panel_bd.
     */
    @Test
    public void testComprobar_Dominio_PK_unico() {
        System.out.println("Comprobar_Dominio_PK_unico");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Comprobar_Dominio_PK_unico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Comprobar_Dominio_FK_PK_unico method, of class Prot_panel_bd.
     */
    @Test
    public void testComprobar_Dominio_FK_PK_unico() {
        System.out.println("Comprobar_Dominio_FK_PK_unico");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Comprobar_Dominio_FK_PK_unico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PK_Dominio_Debe_ser_tipo_entero_char_cadena method, of class Prot_panel_bd.
     */
    @Test
    public void testPK_Dominio_Debe_ser_tipo_entero_char_cadena() {
        System.out.println("PK_Dominio_Debe_ser_tipo_entero_char_cadena");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.PK_Dominio_Debe_ser_tipo_entero_char_cadena();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Existe_Indice_Dominio method, of class Prot_panel_bd.
     */
    @Test
    public void testExiste_Indice_Dominio() {
        System.out.println("Existe_Indice_Dominio");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Existe_Indice_Dominio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Dominio_velocidad_consulta_indice method, of class Prot_panel_bd.
     */
    @Test
    public void testDominio_velocidad_consulta_indice() {
        System.out.println("Dominio_velocidad_consulta_indice");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Dominio_velocidad_consulta_indice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Dominio_Registros_obtenidos method, of class Prot_panel_bd.
     */
    @Test
    public void testDominio_Registros_obtenidos() {
        System.out.println("Dominio_Registros_obtenidos");
        Prot_panel_bd instance = new Prot_panel_bd();
        ArrayList<Dominio> expResult = null;
        ArrayList<Dominio> result = instance.Dominio_Registros_obtenidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Existe_tabla_Usuario method, of class Prot_panel_bd.
     */
    @Test
    public void testExiste_tabla_Usuario() {
        System.out.println("Existe_tabla_Usuario");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Existe_tabla_Usuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Atributos_Usuario method, of class Prot_panel_bd.
     */
    @Test
    public void testAtributos_Usuario() {
        System.out.println("Atributos_Usuario");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Atributos_Usuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FK_Usuario method, of class Prot_panel_bd.
     */
    @Test
    public void testFK_Usuario() {
        System.out.println("FK_Usuario");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.FK_Usuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Compatibilidad_Usuario_tipo_PK_FK method, of class Prot_panel_bd.
     */
    @Test
    public void testCompatibilidad_Usuario_tipo_PK_FK() {
        System.out.println("Compatibilidad_Usuario_tipo_PK_FK");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Compatibilidad_Usuario_tipo_PK_FK();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Cardinalidad_Usuario_Fornaneas method, of class Prot_panel_bd.
     */
    @Test
    public void testCardinalidad_Usuario_Fornaneas() {
        System.out.println("Cardinalidad_Usuario_Fornaneas");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Cardinalidad_Usuario_Fornaneas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Comprobar_Usuario_PK_unico method, of class Prot_panel_bd.
     */
    @Test
    public void testComprobar_Usuario_PK_unico() {
        System.out.println("Comprobar_Usuario_PK_unico");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Comprobar_Usuario_PK_unico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Comprobar_Usuario_FK_PK_unico method, of class Prot_panel_bd.
     */
    @Test
    public void testComprobar_Usuario_FK_PK_unico() {
        System.out.println("Comprobar_Usuario_FK_PK_unico");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Comprobar_Usuario_FK_PK_unico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PK_Usuario_Debe_ser_tipo_entero_char_cadena method, of class Prot_panel_bd.
     */
    @Test
    public void testPK_Usuario_Debe_ser_tipo_entero_char_cadena() {
        System.out.println("PK_Usuario_Debe_ser_tipo_entero_char_cadena");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.PK_Usuario_Debe_ser_tipo_entero_char_cadena();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Existe_Indice_Usuario method, of class Prot_panel_bd.
     */
    @Test
    public void testExiste_Indice_Usuario() {
        System.out.println("Existe_Indice_Usuario");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Existe_Indice_Usuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Usuario_velocidad_consulta_indice method, of class Prot_panel_bd.
     */
    @Test
    public void testUsuario_velocidad_consulta_indice() {
        System.out.println("Usuario_velocidad_consulta_indice");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Usuario_velocidad_consulta_indice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Usuario_Registros_obtenidos method, of class Prot_panel_bd.
     */
    @Test
    public void testUsuario_Registros_obtenidos() {
        System.out.println("Usuario_Registros_obtenidos");
        Prot_panel_bd instance = new Prot_panel_bd();
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = instance.Usuario_Registros_obtenidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Existe_tabla_Grupo method, of class Prot_panel_bd.
     */
    @Test
    public void testExiste_tabla_Grupo() {
        System.out.println("Existe_tabla_Grupo");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Existe_tabla_Grupo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Atributos_Grupo method, of class Prot_panel_bd.
     */
    @Test
    public void testAtributos_Grupo() {
        System.out.println("Atributos_Grupo");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Atributos_Grupo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FK_Grupo method, of class Prot_panel_bd.
     */
    @Test
    public void testFK_Grupo() {
        System.out.println("FK_Grupo");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.FK_Grupo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Compatibilidad_Grupo_tipo_PK_FK method, of class Prot_panel_bd.
     */
    @Test
    public void testCompatibilidad_Grupo_tipo_PK_FK() {
        System.out.println("Compatibilidad_Grupo_tipo_PK_FK");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Compatibilidad_Grupo_tipo_PK_FK();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Cardinalidad_Grupo_Fornaneas method, of class Prot_panel_bd.
     */
    @Test
    public void testCardinalidad_Grupo_Fornaneas() {
        System.out.println("Cardinalidad_Grupo_Fornaneas");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Cardinalidad_Grupo_Fornaneas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Comprobar_Grupo_PK_unico method, of class Prot_panel_bd.
     */
    @Test
    public void testComprobar_Grupo_PK_unico() {
        System.out.println("Comprobar_Grupo_PK_unico");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Comprobar_Grupo_PK_unico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Comprobar_Grupo_FK_PK_unico method, of class Prot_panel_bd.
     */
    @Test
    public void testComprobar_Grupo_FK_PK_unico() {
        System.out.println("Comprobar_Grupo_FK_PK_unico");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Comprobar_Grupo_FK_PK_unico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PK_Grupo_Debe_ser_tipo_entero_char_cadena method, of class Prot_panel_bd.
     */
    @Test
    public void testPK_Grupo_Debe_ser_tipo_entero_char_cadena() {
        System.out.println("PK_Grupo_Debe_ser_tipo_entero_char_cadena");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.PK_Grupo_Debe_ser_tipo_entero_char_cadena();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Existe_Indice_Grupo method, of class Prot_panel_bd.
     */
    @Test
    public void testExiste_Indice_Grupo() {
        System.out.println("Existe_Indice_Grupo");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Existe_Indice_Grupo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Grupo_velocidad_consulta_indice method, of class Prot_panel_bd.
     */
    @Test
    public void testGrupo_velocidad_consulta_indice() {
        System.out.println("Grupo_velocidad_consulta_indice");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Grupo_velocidad_consulta_indice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Grupo_Registros_obtenidos method, of class Prot_panel_bd.
     */
    @Test
    public void testGrupo_Registros_obtenidos() {
        System.out.println("Grupo_Registros_obtenidos");
        Prot_panel_bd instance = new Prot_panel_bd();
        ArrayList<Grupo> expResult = null;
        ArrayList<Grupo> result = instance.Grupo_Registros_obtenidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Existe_tabla_Administrador method, of class Prot_panel_bd.
     */
    @Test
    public void testExiste_tabla_Administrador() {
        System.out.println("Existe_tabla_Administrador");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Existe_tabla_Administrador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Atributos_Administrador method, of class Prot_panel_bd.
     */
    @Test
    public void testAtributos_Administrador() {
        System.out.println("Atributos_Administrador");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Atributos_Administrador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FK_Administrador method, of class Prot_panel_bd.
     */
    @Test
    public void testFK_Administrador() {
        System.out.println("FK_Administrador");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.FK_Administrador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Compatibilidad_Administrador_tipo_PK_FK method, of class Prot_panel_bd.
     */
    @Test
    public void testCompatibilidad_Administrador_tipo_PK_FK() {
        System.out.println("Compatibilidad_Administrador_tipo_PK_FK");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Compatibilidad_Administrador_tipo_PK_FK();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Cardinalidad_Administrador_Fornaneas method, of class Prot_panel_bd.
     */
    @Test
    public void testCardinalidad_Administrador_Fornaneas() {
        System.out.println("Cardinalidad_Administrador_Fornaneas");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Cardinalidad_Administrador_Fornaneas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Comprobar_Administrador_PK_unico method, of class Prot_panel_bd.
     */
    @Test
    public void testComprobar_Administrador_PK_unico() {
        System.out.println("Comprobar_Administrador_PK_unico");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Comprobar_Administrador_PK_unico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Comprobar_Administrador_FK_PK_unico method, of class Prot_panel_bd.
     */
    @Test
    public void testComprobar_Administrador_FK_PK_unico() {
        System.out.println("Comprobar_Administrador_FK_PK_unico");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Comprobar_Administrador_FK_PK_unico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PK_Administrador_Debe_ser_tipo_entero_char_cadena method, of class Prot_panel_bd.
     */
    @Test
    public void testPK_Administrador_Debe_ser_tipo_entero_char_cadena() {
        System.out.println("PK_Administrador_Debe_ser_tipo_entero_char_cadena");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.PK_Administrador_Debe_ser_tipo_entero_char_cadena();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Existe_Indice_Administrador method, of class Prot_panel_bd.
     */
    @Test
    public void testExiste_Indice_Administrador() {
        System.out.println("Existe_Indice_Administrador");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Existe_Indice_Administrador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Administrador_velocidad_consulta_indice method, of class Prot_panel_bd.
     */
    @Test
    public void testAdministrador_velocidad_consulta_indice() {
        System.out.println("Administrador_velocidad_consulta_indice");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Administrador_velocidad_consulta_indice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Administrador_Registros_obtenidos method, of class Prot_panel_bd.
     */
    @Test
    public void testAdministrador_Registros_obtenidos() {
        System.out.println("Administrador_Registros_obtenidos");
        Prot_panel_bd instance = new Prot_panel_bd();
        ArrayList<Administrador> expResult = null;
        ArrayList<Administrador> result = instance.Administrador_Registros_obtenidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Existe_tabla_Ciudad method, of class Prot_panel_bd.
     */
    @Test
    public void testExiste_tabla_Ciudad() {
        System.out.println("Existe_tabla_Ciudad");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Existe_tabla_Ciudad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Atributos_Ciudad method, of class Prot_panel_bd.
     */
    @Test
    public void testAtributos_Ciudad() {
        System.out.println("Atributos_Ciudad");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Atributos_Ciudad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FK_Ciudad method, of class Prot_panel_bd.
     */
    @Test
    public void testFK_Ciudad() {
        System.out.println("FK_Ciudad");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.FK_Ciudad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Compatibilidad_Ciudad_tipo_PK_FK method, of class Prot_panel_bd.
     */
    @Test
    public void testCompatibilidad_Ciudad_tipo_PK_FK() {
        System.out.println("Compatibilidad_Ciudad_tipo_PK_FK");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Compatibilidad_Ciudad_tipo_PK_FK();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Cardinalidad_Ciudad_Fornaneas method, of class Prot_panel_bd.
     */
    @Test
    public void testCardinalidad_Ciudad_Fornaneas() {
        System.out.println("Cardinalidad_Ciudad_Fornaneas");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Cardinalidad_Ciudad_Fornaneas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Comprobar_Ciudad_PK_unico method, of class Prot_panel_bd.
     */
    @Test
    public void testComprobar_Ciudad_PK_unico() {
        System.out.println("Comprobar_Ciudad_PK_unico");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Comprobar_Ciudad_PK_unico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Comprobar_Ciudad_FK_PK_unico method, of class Prot_panel_bd.
     */
    @Test
    public void testComprobar_Ciudad_FK_PK_unico() {
        System.out.println("Comprobar_Ciudad_FK_PK_unico");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Comprobar_Ciudad_FK_PK_unico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PK_Ciudad_Debe_ser_tipo_entero_char_cadena method, of class Prot_panel_bd.
     */
    @Test
    public void testPK_Ciudad_Debe_ser_tipo_entero_char_cadena() {
        System.out.println("PK_Ciudad_Debe_ser_tipo_entero_char_cadena");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.PK_Ciudad_Debe_ser_tipo_entero_char_cadena();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Existe_Indice_Ciudad method, of class Prot_panel_bd.
     */
    @Test
    public void testExiste_Indice_Ciudad() {
        System.out.println("Existe_Indice_Ciudad");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Existe_Indice_Ciudad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ciudad_velocidad_consulta_indice method, of class Prot_panel_bd.
     */
    @Test
    public void testCiudad_velocidad_consulta_indice() {
        System.out.println("Ciudad_velocidad_consulta_indice");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Ciudad_velocidad_consulta_indice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ciudad_Registros_obtenidos method, of class Prot_panel_bd.
     */
    @Test
    public void testCiudad_Registros_obtenidos() {
        System.out.println("Ciudad_Registros_obtenidos");
        Prot_panel_bd instance = new Prot_panel_bd();
        ArrayList<Ciudad> expResult = null;
        ArrayList<Ciudad> result = instance.Ciudad_Registros_obtenidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crear_nuevo_usuario_cliente method, of class Prot_panel_bd.
     */
    @Test
    public void testCrear_nuevo_usuario_cliente() {
        System.out.println("crear_nuevo_usuario_cliente");
        Usuario usuario = null;
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.crear_nuevo_usuario_cliente(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subir_proyecto method, of class Prot_panel_bd.
     */
    @Test
    public void testSubir_proyecto() {
        System.out.println("subir_proyecto");
        Usuario usuario = null;
        String nombre_aplicacion = "";
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.subir_proyecto(usuario, nombre_aplicacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificar_proyecto method, of class Prot_panel_bd.
     */
    @Test
    public void testModificar_proyecto() {
        System.out.println("modificar_proyecto");
        Usuario usuario = null;
        String nombre_aplicacion = "";
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.modificar_proyecto(usuario, nombre_aplicacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar_aplicacion method, of class Prot_panel_bd.
     */
    @Test
    public void testEliminar_aplicacion() {
        System.out.println("eliminar_aplicacion");
        Aplicacion aplicación = null;
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.eliminar_aplicacion(aplicación);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compilar_proyecto method, of class Prot_panel_bd.
     */
    @Test
    public void testCompilar_proyecto() {
        System.out.println("compilar_proyecto");
        Aplicacion aplicación = null;
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.compilar_proyecto(aplicación);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desplegar_desde_servidor_web method, of class Prot_panel_bd.
     */
    @Test
    public void testDesplegar_desde_servidor_web() {
        System.out.println("desplegar_desde_servidor_web");
        Aplicacion aplicacion = null;
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.desplegar_desde_servidor_web(aplicacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of autenticar_clientes method, of class Prot_panel_bd.
     */
    @Test
    public void testAutenticar_clientes() {
        System.out.println("autenticar_clientes");
        String nombre = "";
        String clave = "";
        Prot_panel_bd instance = new Prot_panel_bd();
        boolean expResult = false;
        boolean result = instance.autenticar_clientes(nombre, clave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of autenticar_administradores method, of class Prot_panel_bd.
     */
    @Test
    public void testAutenticar_administradores() {
        System.out.println("autenticar_administradores");
        String nombre = "";
        String clave = "";
        Prot_panel_bd instance = new Prot_panel_bd();
        boolean expResult = false;
        boolean result = instance.autenticar_administradores(nombre, clave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editar_cliente method, of class Prot_panel_bd.
     */
    @Test
    public void testEditar_cliente() {
        System.out.println("editar_cliente");
        Usuario usuario = null;
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.editar_cliente(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crear_nueva_base_datos method, of class Prot_panel_bd.
     */
    @Test
    public void testCrear_nueva_base_datos() {
        System.out.println("crear_nueva_base_datos");
        BasesDatos bd = null;
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.crear_nueva_base_datos(bd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restaurar_base_datos method, of class Prot_panel_bd.
     */
    @Test
    public void testRestaurar_base_datos() {
        System.out.println("restaurar_base_datos");
        BasesDatos bd = null;
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.restaurar_base_datos(bd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of respaldar_base_datos method, of class Prot_panel_bd.
     */
    @Test
    public void testRespaldar_base_datos() {
        System.out.println("respaldar_base_datos");
        BasesDatos bd = null;
        Prot_panel_bd instance = new Prot_panel_bd();
        String expResult = "";
        String result = instance.respaldar_base_datos(bd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visualizar_consumo_recursos method, of class Prot_panel_bd.
     */
    @Test
    public void testVisualizar_consumo_recursos() {
        System.out.println("visualizar_consumo_recursos");
        Usuario usuario = null;
        Prot_panel_bd instance = new Prot_panel_bd();
        String expResult = "";
        String result = instance.visualizar_consumo_recursos(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visualizar_aplicaciones method, of class Prot_panel_bd.
     */
    @Test
    public void testVisualizar_aplicaciones() {
        System.out.println("visualizar_aplicaciones");
        Usuario usuario = null;
        Prot_panel_bd instance = new Prot_panel_bd();
        String expResult = "";
        String result = instance.visualizar_aplicaciones(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visualizar_bases_datos method, of class Prot_panel_bd.
     */
    @Test
    public void testVisualizar_bases_datos() {
        System.out.println("visualizar_bases_datos");
        Usuario usuario = null;
        Prot_panel_bd instance = new Prot_panel_bd();
        String expResult = "";
        String result = instance.visualizar_bases_datos(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visualizar_dominios method, of class Prot_panel_bd.
     */
    @Test
    public void testVisualizar_dominios() {
        System.out.println("visualizar_dominios");
        Usuario usuario = null;
        Prot_panel_bd instance = new Prot_panel_bd();
        String expResult = "";
        String result = instance.visualizar_dominios(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visualizar_codigo method, of class Prot_panel_bd.
     */
    @Test
    public void testVisualizar_codigo() {
        System.out.println("visualizar_codigo");
        Usuario usuario = null;
        Aplicacion aplicacion = null;
        String archivo = "";
        Prot_panel_bd instance = new Prot_panel_bd();
        String expResult = "";
        String result = instance.visualizar_codigo(usuario, aplicacion, archivo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
