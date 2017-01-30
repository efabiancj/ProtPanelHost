/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prot_panel_hostv3.logica.clases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 *
 * @author ecordova
 */
public class Prot_panel_interfacesIT {
    
    
    public static WebDriver driver=null;
            
    public Prot_panel_interfacesIT() {
    }

    @BeforeClass
    static public void inicializarDriver()
    {
        
    }
    
    @AfterClass
    static public void finalizarDriver()
    {
        driver.quit();
    }
    
    @Test
    public void enlace_index_a_login() {
        
        driver.get("http://localhost:8080/index.xhtml");
        WebElement link_auth = driver.findElement(By.id("link_auth"));
        link_auth.click();
    }
    
     
    @Test
    public void enlace_index_a_registro() {
        
        driver.get("http://localhost:8080/Prot_panel_hostv3/index.xhtml");
        
        WebElement link_reg = driver.findElement(By.id("link_reg"));
        link_reg.click();
        
    }
    
}
