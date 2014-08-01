package com.mycompany.springapp.service;

import com.mycompany.springapp.domain.Producto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by developer on 7/31/14.
 */
public interface ProductManager extends Serializable{

    public void incrementarPrecio(int porcentaje);

    public List<Producto> getProductos();
}
