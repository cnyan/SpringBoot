package com.springmvc.web;

import com.springmvc.domain.DemoObj;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 闫继龙 on 12/07/2017.
 *
 */

@RestController
@RequestMapping(value = "/rest",produces ={"application/json;charset=UTF-8"})
public class RestDemoController {


    @RequestMapping(value = "")
    @ResponseBody
    public String rest(){

        return "this is rest controller";
    }

    @RequestMapping(value = "/getJson")
    public DemoObj getJson(DemoObj obj){

        return new DemoObj(obj.getId(),obj.getName());
    }
}
