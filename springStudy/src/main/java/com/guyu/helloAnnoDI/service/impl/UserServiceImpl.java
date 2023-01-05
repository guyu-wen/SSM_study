package com.guyu.helloAnnoDI.service.impl;

import com.guyu.helloAnnoDI.dao.UserDao;
import com.guyu.helloAnnoDI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author      : guyu
 * @date        : 2023/1/4 22:59
 * @description : some description
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userdao;
    public UserServiceImpl() {
        System.out.println("UserServiceImpl init......");
    }
}