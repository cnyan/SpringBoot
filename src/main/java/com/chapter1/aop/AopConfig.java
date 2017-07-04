package com.chapter1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by 闫继龙 on 04/07/2017.
 * 切面配置类
 */
@Configuration
@ComponentScan("com.chapter1.aop")
@EnableAspectJAutoProxy //启动spring 对 aspectJ注解的支持
public class AopConfig {


}
