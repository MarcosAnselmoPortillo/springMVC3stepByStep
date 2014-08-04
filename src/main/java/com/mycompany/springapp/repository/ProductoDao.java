package com.mycompany.springapp.repository;

import com.mycompany.springapp.domain.Producto;

import java.util.List;

/**
 * Created by developer on 8/4/14.
 */
public interface ProductoDao {

    public List<Producto> getListaProductos();

    public void saveProducto(Producto producto);
}
