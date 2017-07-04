package com.chapter1.aop;

import org.springframework.stereotype.Service;


/**
 * Created by 闫继龙 on 04/07/2017.
 * 使用注解的被拦截类
 */
@Service
public class DemoAnnotationService {


    @Action(name = "注解式拦截的操作")
    public void add(){

    }

}
