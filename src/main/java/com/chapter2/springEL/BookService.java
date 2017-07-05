package com.chapter2.springEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by 闫继龙 on 05/07/2017.
 *
 */


@Service
public class BookService {

    @Value("作者闫继龙")
    private String author;
    @Value("书名")
    private String name;


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
