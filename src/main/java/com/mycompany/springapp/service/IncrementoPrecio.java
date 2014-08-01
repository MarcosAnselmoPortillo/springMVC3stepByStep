package com.mycompany.springapp.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * Created by developer on 8/1/14.
 */
public class IncrementoPrecio {

    /**Logger for this class and subclasses*/
    protected final Log logger= LogFactory.getLog(getClass());

    @Min(0)
    @Max(50)
    private int porcentaje;

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int i) {
        porcentaje=i;
        logger.info("Porcentaje seteado a "+i);
    }
}
