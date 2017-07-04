package com.chapter1.aop2;


import org.springframework.stereotype.Component;

/**
 * Created by 闫继龙 on 04/07/2017.
 * PersonServiceBean接口实现类
 */

@Component
public class PersonServiceBean implements PersonServer {


    public void save(String name) {
        System.out.println("我是save方法");
    }

    public void update(String name, Integer id) {
        System.out.println("我是update()方法");
    }

    public String getPersonName(Integer id) {
        System.out.println("我是getPersonName()方法");
        return "xxx";
    }


}
