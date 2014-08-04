package com.mycompany.springapp.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Created by developer on 7/31/14.
 */
@Entity
@Table(name = "productos")
public class Producto implements Serializable{

    private static final long serialVersionUID = 1L;



    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String descripcion;
    private Double precio;


    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String toString(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("Descripcion: "+ descripcion + ";");
        buffer.append("Precio: "+precio);
        return buffer.toString();
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

}
