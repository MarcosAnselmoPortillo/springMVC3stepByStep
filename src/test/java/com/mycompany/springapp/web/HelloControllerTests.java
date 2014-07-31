package com.mycompany.springapp.web;

import com.mycompany.springapp.web.HelloController;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import java.lang.Exception;

import static org.junit.Assert.*;

public class HelloControllerTests{

    @Test
    public void testHandleRequestView() throws Exception{
        HelloController helloController = new HelloController();
        ModelAndView modelAndView = helloController.handleRequest(null,null);
        assertEquals("WEB-INF/vistas/hello.jsp",modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String nowValue = (String) modelAndView.getModel().get("now");
        assertNotNull(nowValue);
    }
}