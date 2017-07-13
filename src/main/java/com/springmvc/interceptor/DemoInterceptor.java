package com.springmvc.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 闫继龙 on 12/07/2017.
 * 自定义一个拦截器，继承 HandlerInterceptorAdapter
 * ,在MyMvcConfig 使用
 */
public class DemoInterceptor extends HandlerInterceptorAdapter{


    /**
     * This implementation always returns {@code true}.
     * 在请求之前执行
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime",startTime);

        return true;
    }

    /**
     * This implementation is empty.
     * 在请求之后执行
     */
    @Override
    public void postHandle(
            HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
            throws Exception {

        long startTime = (Long) request.getAttribute("startTime");
        request.removeAttribute("startTime");

        long endTime = System.currentTimeMillis();
        System.out.println("本次请求处理时间是:" + (endTime - startTime) + " ms");

        request.setAttribute("handerTime" , endTime - startTime);

    }

}
