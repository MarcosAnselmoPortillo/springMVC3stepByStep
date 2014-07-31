package com.mycompany.springapp.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@Controller
public class HelloController{

    protected final Log logger = LogFactory.getLog(getClass());

    @RequestMapping(value = "/hello.htm")
    public ModelAndView handleRequest (HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{

        String now = (new Date()).toString();
        logger.info("Returning hello view with "+now);

        return new ModelAndView("WEB-INF/vistas/hello.jsp","now",now);
    }
}