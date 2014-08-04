package com.mycompany.springapp.service;

import com.mycompany.springapp.domain.Producto;
import com.mycompany.springapp.repository.ProductoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by developer on 7/31/14.
 */
@Component
public class SimpleProductManager implements ProductManager {

    private static final long serialVersionUID=1L;

    @Autowired
    private ProductoDao productoDao;

    public void setProductoDao(ProductoDao productoDao) {
        this.productoDao = productoDao;
    }

    public List<Producto> getProductos(){
        return productoDao.getListaProductos();
    }

    public void incrementarPrecio(int porcentaje){
        List<Producto> productos = productoDao.getListaProductos();
        if (productos != null){
            for(Producto producto : productos){
                double newPrice = producto.getPrecio().doubleValue()*(100+ porcentaje)/100;
                producto.setPrecio(newPrice);
                productoDao.saveProducto(producto);
            }
        }
    }

}
