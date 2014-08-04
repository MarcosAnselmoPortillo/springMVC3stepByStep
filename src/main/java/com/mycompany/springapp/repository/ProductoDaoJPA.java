package com.mycompany.springapp.repository;

import com.mycompany.springapp.domain.Producto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by developer on 8/4/14.
 */
@Repository(value = "productoDao")
public class ProductoDaoJPA implements ProductoDao{

    private EntityManager em = null;

    /*
     * Sets the entity manager.
     */
    @PersistenceContext
    public void setEntityManager(EntityManager em){
        this.em = em;
    }

    @Transactional(readOnly = true)
    public List<Producto> getListaProductos(){
        return em.createQuery("select p from Producto p order by p.id").getResultList();
    }

    @Transactional(readOnly = false)
    public void saveProducto(Producto producto){
        em.merge(producto);
    }

}
