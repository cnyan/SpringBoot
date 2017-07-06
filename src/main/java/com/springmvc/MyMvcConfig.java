package com.springmvc;

/**
 * Created by 闫继龙 on 06/07/2017.
 * spring MVC 配置lei
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * 配置jsp的 viewResolver，用来映射路径和实际页面中的位置
 */

@EnableWebMvc
@Configuration
@ComponentScan("com.springmvc")
public class MyMvcConfig {

    @Bean
    public InternalResourceViewResolver viewResolver(){

        InternalResourceViewResolver viewResolver  = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/classes/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);

        return viewResolver;

    }
}
