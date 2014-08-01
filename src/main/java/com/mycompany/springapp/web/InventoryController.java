package com.mycompany.springapp.web;

import com.mycompany.springapp.service.ProductManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class InventoryController {

    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private ProductManager productManager;

    public void setProductManager(ProductManager productManager) {
        this.productManager = productManager;
    }

    @RequestMapping(value = "/hello.htm")
    public ModelAndView handleRequest (HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{

        String now = (new Date()).toString();
        logger.info("Returning hello view with "+now);

        Map<String,Object> miModelo = new HashMap<String, Object>();
        miModelo.put("now",now);
        miModelo.put("productos",this.productManager.getProductos());

        return new ModelAndView("hello","modelo",miModelo);
    }

}