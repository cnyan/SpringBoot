package com.springmvc.web;

import javax.servlet.http.HttpServletRequest;

import com.springmvc.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 闫继龙 on 12/07/2017.
 */

@Controller
@RequestMapping(value = "/json",produces = "text/plain;charset=UTF-8")
public class JsonDemoController {



    @RequestMapping(produces = "text/plain;charset=UTF-8")   //produces 可处理返回的媒体类型和返回值
    public @ResponseBody String index(HttpServletRequest servletRequest){

        return "url:" + servletRequest.getRequestURL() + " can access";
    }



    @RequestMapping(value = "/path/{str}")
    public @ResponseBody String demoPathVar(@PathVariable String str, HttpServletRequest servletRequest){

        return "url:" + servletRequest.getRequestURL() + " can access, str = " + str;
    }

    //http://localhost:8080/json/requestParam?id=123
    @RequestMapping(value = "/requestParam")
    public @ResponseBody String passRequestParam(long id,HttpServletRequest servletRequest){

        return "url:" + servletRequest.getRequestURL() + " can access,id = " + id;
    }

    //http://localhost:8080/json/requestObj?id=3&name=zhangsan
    @RequestMapping(value = "/requestObj")
    @ResponseBody
    public String  passObj(DemoObj obj,HttpServletRequest servletRequest){

        return "url:" + servletRequest.getRequestURL() + " can access,id = " + obj.getId() + ",name = " + obj.getName();
    }


    @RequestMapping(value = { "/name1", "/name2" }, produces = "text/plain;charset=UTF-8")//9
    public @ResponseBody String remove(HttpServletRequest request) {

        return "url:" + request.getRequestURL() + " can access";
    }

}
