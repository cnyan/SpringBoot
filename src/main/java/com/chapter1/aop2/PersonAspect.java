package com.chapter1.aop2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by 闫继龙 on 04/07/2017.
 * 使用Spring注解方式对这个Bean进行方法拦截
 */

@Aspect
@Component
public class PersonAspect {

    /**
     * 声明切入点表达式，一般在该方法中不再添加其他代码。
     * 使用@Pointcut来声明切入点表达式。
     * 后面的通知直接使用方法名来引用当前的切入点表达式。
     */
    @Pointcut("execution(* com.chapter1.aop2.PersonServiceBean.*(..))")
    private void anyMethod(){}


    @Before("anyMethod() && args(name)")
    public void doAccessCheck(String name){
        System.out.println(name);
        System.out.println("前置通知");
    }

    @AfterReturning("anyMethod()")
    public void doAfter(){
        System.out.println("返回通知，在方法返回结果之后执行");
    }

    @After("anyMethod()")
    public void after(){
        System.out.println("后置通知，在方法执行之后执行");
    }

    @AfterThrowing("anyMethod()")
    public void doAfterThrow(){
        System.out.println("异常通知，在方法抛出异常之后执行");
    }

    /**
     * 环绕通知类似于动态代理的全过程，ProceedingJoinPoint类型的参数可以决定是否执行目标方法。
     * @param pjp 环绕通知需要携带ProceedingJoinPoint类型的参数。
     * @return 目标方法的返回值。必须有返回值。
     */
    @Around("anyMethod()")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("进入环绕通知");
        Object object = pjp.proceed();//执行该方法
        System.out.println("退出方法");
        return object;
    }

}
