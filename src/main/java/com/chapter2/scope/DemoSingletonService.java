package com.chapter2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by 闫继龙 on 05/07/2017.
 * 编写singleton Bean
 */

/**
 * singleton一个容器只有一个 singleton bean 实例，全容器共享一个bean
 */
@Service
@Scope("singleton")
public class DemoSingletonService {



}
