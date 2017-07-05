package com.chapter2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by 闫继龙 on 05/07/2017.
 *
 */

/**
 * prototype 每次都单独创建一个 bean
 */

@Service
@Scope("prototype")
public class DemoPropotypeService {


}
