package com.mycompany.springapp.domain;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by developer on 7/31/14.
 */
public class ProductTests {

    private Producto producto;

    @Before
    public void setUp() throws Exception{
        producto = new Producto();
    }

     @Test
    public void testSetAndGetDescripcion(){
         String testDescripcion = "una Descripcion";
         assertNull(producto.getDescripcion());
         producto.setDescripcion(testDescripcion);
         assertEquals(testDescripcion,producto.getDescripcion());
     }

    @Test
    public void testSetAndGetPrecio(){
        double testPrecio = 100.00;
        assertEquals(0,0,0);
        producto.setPrecio(testPrecio);
        assertEquals(testPrecio,producto.getPrecio(),0);
    }


}
