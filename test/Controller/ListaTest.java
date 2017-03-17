/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author teodora
 */
public class ListaTest {
    
    public ListaTest() {
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
     * Test of esVacia method, of class Lista.
     */
    @Test
    public void testEsVacia() {
        System.out.println("esVacia");
        Lista instance = new Lista();
        boolean expResult = true;
        boolean result = instance.esVacia();
        assertEquals(expResult, result);
       
        
    }

    /**
     * Test of añadir method, of class Lista.
     */
    @Test
    public void testAñadir() {
        System.out.println("a\u00f1adir");
        Lista instance = new Lista();
        instance.añadir();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of localizar method, of class Lista.
     */
    @Test
    public void testLocalizar() {
        System.out.println("localizar");
        Lista instance = new Lista();
        int expResult = 0;
        int result = instance.localizar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class Lista.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Object elemento = null;
        Lista instance = new Lista();
        instance.eliminar(elemento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contiene method, of class Lista.
     */
    @Test
    public void testContiene() {
        System.out.println("contiene");
        Object elemento = null;
        Lista instance = new Lista();
        boolean expResult = false;
        boolean result = instance.contiene(elemento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sustituir method, of class Lista.
     */
    @Test
    public void testSustituir() {
        System.out.println("sustituir");
        Object actual = null;
        Object nuevo = null;
        Lista instance = new Lista();
        instance.sustituir(actual, nuevo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contador method, of class Lista.
     */
    @Test
    public void testContador() {
        System.out.println("contador");
        Lista instance = new Lista();
        Iterator expResult = null;
        Iterator result = instance.contador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
