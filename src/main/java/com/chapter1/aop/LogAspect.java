package com.chapter1.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by 闫继龙 on 04/07/2017.
 *  切面类
 */

@Aspect //声明一个切面
@Component //声明一个bean
public class LogAspect {


    @Pointcut(value = "@annotation(com.chapter1.aop.Action)")  //注明切点
    public void annotationPointCut(){}


    @After(value = "annotationPointCut()")
    public void after(JoinPoint joinPoint){

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();

        Action action = method.getAnnotation(Action.class);
        System.out.println("注解拦截：" + action.name());
    }


    @Before(value = "execution(* com.chapter1.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){


        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("方法规则拦截：" + method.getName());
    }



}
