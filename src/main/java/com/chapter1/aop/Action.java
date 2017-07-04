package com.chapter1.aop;

import java.lang.annotation.*;

/**
 * Created by jsj-9-4 on 04/07/2017.
 * 编写具有拦截功能的注解(自定义注解)
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {

    String name();
}
