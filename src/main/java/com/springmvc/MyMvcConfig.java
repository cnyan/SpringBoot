package com.springmvc;

/**
 * Created by 闫继龙 on 06/07/2017.
 * spring MVC 配置lei
 */

import com.springmvc.interceptor.DemoInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * 配置jsp的 viewResolver，用来映射路径和实际页面中的位置
 */

/**
 * 默认的基本配置
 */

//@EnableWebMvc
//@Configuration
//@ComponentScan("com.springmvc.web")
//public class MyMvcConfig {
//
//    @Bean
//    public InternalResourceViewResolver viewResolver(){
//
//        InternalResourceViewResolver viewResolver  = new InternalResourceViewResolver();
//        viewResolver.setPrefix("/WEB-INF/classes/views/");
//        viewResolver.setSuffix(".jsp");
//        viewResolver.setViewClass(JstlView.class);
//
//        return viewResolver;
//
//    }
//}


/**
 * 个性化配置,，可以直接访问静态文件
 */

@EnableWebMvc
@Configuration
@ComponentScan("com.springmvc.web")
public class MyMvcConfig extends WebMvcConfigurerAdapter{

    /**
     *  配置对 jsp 文件的访问
     * @return
     */
    @Bean
    public InternalResourceViewResolver viewResolver(){

        InternalResourceViewResolver viewResolver  = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/classes/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);

        return viewResolver;

    }

    /**
     * 配置对 静态文件的访问
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        //addResourceHandler 对外暴露的路径
        //addResourceLocations 访问的路径
        registry.addResourceHandler("/asserts/**").addResourceLocations("classpath:/asserts/");
    }


    /**
     * 配置拦截的 bean
     * @return
     */
    @Bean
    public DemoInterceptor demoInterceptor(){

        return  new DemoInterceptor();
    }

    /**
     * 重写方法，注册拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(demoInterceptor());

    }


    /**
     * {@inheritDoc}
     * 集中控制controller 进行的页面跳转
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/index").setViewName("/index");
        registry.addViewController("/anno").setViewName("/index");
        registry.addViewController("/advice").setViewName("/error");
        registry.addViewController("/toUpload").setViewName("/uploadfile");
        registry.addViewController("/sse").setViewName("/sse");
    }


    @Bean
    //配置文本上传
    public MultipartResolver multipartResolver(){

        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
        commonsMultipartResolver.setMaxUploadSize(1000000);
        return commonsMultipartResolver;
    }

}
