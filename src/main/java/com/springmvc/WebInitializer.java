package com.springmvc;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by 闫继龙 on 06/07/2017.
 * WEB 相关配置
 */


public class WebInitializer  implements WebApplicationInitializer {



    public void onStartup(ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();

        webApplicationContext.register(MyMvcConfig.class);
        webApplicationContext.setServletContext(servletContext);

        ServletRegistration.Dynamic servletRegistration = servletContext.addServlet("dispatcher",new DispatcherServlet(webApplicationContext));
        servletRegistration.addMapping("/");

        servletRegistration.setLoadOnStartup(1);


    }
}
