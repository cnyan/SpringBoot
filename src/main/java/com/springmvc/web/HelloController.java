package com.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 闫继龙 on 06/07/2017.
 * 简单控制器
 */

@Controller
public class HelloController {

    @RequestMapping("/index")
    public String hello(){
        return "index";
    }



}
