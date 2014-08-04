package com.mycompany.springapp.web;

import com.mycompany.springapp.domain.Producto;
import com.mycompany.springapp.repository.ProductoDaoEnMemoria;
import com.mycompany.springapp.service.SimpleProductManager;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import java.lang.Exception;
import java.util.ArrayList;
import java.util.Map;

import static org.junit.Assert.*;

public class InventoryControllerTests {

    @Test
    public void testHandleRequestView() throws Exception{
        InventoryController inventoryController = new InventoryController();
        SimpleProductManager spm = new SimpleProductManager();
        spm.setProductoDao(new ProductoDaoEnMemoria(new ArrayList<Producto>()));
        inventoryController.setProductManager(spm);
        //inventoryController.setProductManager(new SimpleProductManager());
        ModelAndView modelAndView = inventoryController.handleRequest(null,null);
        assertEquals("hello",modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        @SuppressWarnings("unchecked")
        Map<String,Object>modelMap=(Map<String,Object>) modelAndView.getModel().get("modelo");
        String nowValue = (String) modelMap.get("now");
        assertNotNull(nowValue);
    }
}