package com.guyu.helloAnnoConfig.pojo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author      : guyu
 * @date        : 2023/1/5 21:20
 * @description : some description
 */
@Component(value = "getUser")
public class User2 {
    private String name;

    public String getName() {
        return name;
    }
    @Value("π»”Í")
    public void setName(String name) {
        this.name = name;
    }
}