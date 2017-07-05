package com.chapter2.springEL;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;


/**
 * Created by 闫继龙 on 05/07/2017.
 *  spring EL 表达式
 */
@Configuration
@ComponentScan(value = "com.chapter2.springEL")
@PropertySource(value = "classpath:chapter2/springEL/book.properties") //指出配置文件路径
public class BookConfig {

    @Value("string normal") //注入普通字符串
    private String normal;

    @Value("#{systemProperties['os.name']}")    //注入操作系统属性
    private  String osName;

    @Value("#{T(java.lang.Math).random() * 100.0}")    //注入表达式结果
    private double randomNumber;

    @Value("#{bookService.author}") //注入其他bean 属性
    private String fromAuthor;

    @Value("classpath:chapter2/springEL/book.txt")  //注入文件资源
    private Resource bookFile;


    @Value("http://www.baidu.com")  //注入网址资源
    private Resource bookUrl;

    @Value("${book.name}")        // ① 注入配置文件
    private String bookName;

    @Autowired                   // ② 注入配置文件
    private Environment environment;


    @Bean                    // ③ 注入配置文件
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return  new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){

        System.out.println(normal);
        System.out.println(osName);
        System.out.println(randomNumber);
        System.out.println(fromAuthor);

        try {
            System.out.println("bookFile:" +IOUtils.toString(bookFile.getInputStream()));
            System.out.println("bookUrl:" + IOUtils.toString(bookUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
