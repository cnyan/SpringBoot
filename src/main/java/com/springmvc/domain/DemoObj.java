package com.springmvc.domain;

/**
 * Created by 闫继龙 on 12/07/2017.
 * 返回json格式
 */

public class DemoObj {

    private Long id;
    private String name;


    public DemoObj(){
        super();
    }

    public DemoObj(Long id, String name) {
        this.id = id;
        this.name = name;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "DemoObj{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
