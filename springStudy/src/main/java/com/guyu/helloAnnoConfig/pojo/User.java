package com.guyu.helloAnnoConfig.pojo;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author      : guyu
 * @date        : 2023/1/5 21:20
 * @description : some description
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }
    @Value("����")
    public void setName(String name) {
        this.name = name;
    }
}