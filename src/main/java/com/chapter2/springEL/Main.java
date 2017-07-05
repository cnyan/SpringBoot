package com.chapter2.springEL;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 闫继龙 on 05/07/2017.
 *
 */
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BookConfig.class);

        BookConfig bookConfig = context.getBean(BookConfig.class);

        bookConfig.outputResource();

        context.close();
    }
}
