package com.mycompany.springapp.web;

import com.mycompany.springapp.service.IncrementoPrecio;
import com.mycompany.springapp.service.ProductManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by developer on 8/1/14.
 */
@Controller
@RequestMapping(value = "/incrementoprecio.htm")
public class IncrementoPrecioFormController {

    /**Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private ProductManager productManager;

    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@Valid IncrementoPrecio incrementoPrecio,BindingResult result){
        if(result.hasErrors()){
            return "incrementoprecio";
        }

        int incremento = incrementoPrecio.getPorcentaje();
        logger.info("Incrementando el precio por "+incremento+"%");

        productManager.incrementarPrecio(incremento);

        return "redirect:/hello.htm";
    }

    @RequestMapping(method = RequestMethod.GET)
    protected IncrementoPrecio formBackingObject (HttpServletRequest request) throws ServletException{
        IncrementoPrecio incrementoPrecio = new IncrementoPrecio();
        incrementoPrecio.setPorcentaje(15);
        return incrementoPrecio;
    }

    public void setProductManager(ProductManager productManager){
        this.productManager=productManager;
    }

    public ProductManager getProductManager(){
        return productManager;
    }

}
