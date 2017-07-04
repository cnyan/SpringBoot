package com.chapter1.aop2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 闫继龙 on 04/07/2017.
 *
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("chapter1.aop2/aop-context.xml");

        //从IOC容器中获取bean实例
        PersonServer bean = (PersonServer) context.getBean("personServiceBean");


        bean.save("张三");
    }
}
