package com.guyu.helloAnnoDI.controller;

import org.springframework.stereotype.Controller;

/**
 * @author      : wenhaojie
 * @date        : 2023/1/4 22:57
 * @description : some description
 */
@Controller
public class UserController {
    public UserController() {
        System.out.println("Controller init......");
    }
}