package com.chapter1.aop2;

/**
 * Created by 闫继龙 on 04/07/2017.
 * PersonServer 接口
 */
public interface PersonServer {

    public void save(String name);
    public void update(String name, Integer id);
    public String getPersonName(Integer id);

}
