package com.guyu.helloAnnoConfig.pojo;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author      : wenhaojie
 * @date        : 2023/1/5 21:20
 * @description : some description
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }
    @Value("π»”Í")
    public void setName(String name) {
        this.name = name;
    }
}