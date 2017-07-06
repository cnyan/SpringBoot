package com.chapter2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 闫继龙 on 05/07/2017.
 *
 */
public class Main {

//    public static void main(String[] args) {
//
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
//
//        DemoSingletonService singletonService1 = context.getBean(DemoSingletonService.class);
//        DemoSingletonService singletonService2 = context.getBean(DemoSingletonService.class);
//
//        DemoPropotypeService propotypeService1 = context.getBean(DemoPropotypeService.class);
//        DemoPropotypeService propotypeService2 = context.getBean(DemoPropotypeService.class);
//
//        System.out.println("s1 与 s2 是否相同：" + singletonService1.equals(singletonService2));
//        System.out.println("s1 与 s2 是否相同：" + propotypeService1.equals(propotypeService2));
//
//        context.close();
//
//    }
}
