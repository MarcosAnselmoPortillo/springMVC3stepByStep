package com.mycompany.springapp.repository;

import com.mycompany.springapp.domain.Producto;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.junit.Assert.*;

import java.util.List;

/**
 * Created by developer on 8/4/14.
 */
public class ProductoDaoJPATests {

    private ApplicationContext context;
    private ProductoDao productoDao;

    @Before
    public void setUp() throws Exception{
        context=new ClassPathXmlApplicationContext("classpath:test-context.xml");
        productoDao = (ProductoDao) context.getBean("productoDao");
    }

    @Test
    public void testGetListaProductos(){
        List<Producto> productos = productoDao.getListaProductos();
        assertEquals(productos.size(),3,0);
    }

    @Test
    public void testSaveProducto(){
        List<Producto> productos = productoDao.getListaProductos();

        Producto p = productos.get(0);
        Double precio = p.getPrecio();
        p.setPrecio(200.12);
        productoDao.saveProducto(p);

        List<Producto> productosActualizados = productoDao.getListaProductos();
        Producto p2 = productosActualizados.get(0);
        assertEquals(p2.getPrecio(),200.12,0);

        p2.setPrecio(precio);
        productoDao.saveProducto(p2);
    }
}
