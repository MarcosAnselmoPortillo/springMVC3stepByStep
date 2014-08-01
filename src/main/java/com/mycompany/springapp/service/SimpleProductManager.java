package com.mycompany.springapp.service;

import com.mycompany.springapp.domain.Producto;

import java.util.List;

/**
 * Created by developer on 7/31/14.
 */
public class SimpleProductManager implements ProductManager {

    private static final long serialVersionUID=1L;

    public List<Producto> getProductos(){
        throw new UnsupportedOperationException();
    }

    public void incrementarPrecio(int porcentaje){ throw new UnsupportedOperationException();}

    public void setProductos(List<Producto> productos){
        throw new UnsupportedOperationException();
    }
}
