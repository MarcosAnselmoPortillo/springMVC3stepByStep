package com.mycompany.springapp.repository;

import com.mycompany.springapp.domain.Producto;

import java.util.List;

/**
 * Created by developer on 8/4/14.
 */
public class ProductoDaoEnMemoria implements ProductoDao{

    private List<Producto> listaProductos;

    public ProductoDaoEnMemoria(List<Producto> listaProductos){
        this.listaProductos=listaProductos;
    }

    public List<Producto> getListaProductos(){
        return listaProductos;
    }

    public void saveProducto(Producto producto){

    }
}
