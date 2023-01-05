package com.guyu.helloAnnoDI.dao.impl;

import com.guyu.helloAnnoDI.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author : guyu
 * @date : 2023/1/5 8:57
 * @description : some description
 */
@Repository
public class UserDaoImpl2 implements UserDao {
    public UserDaoImpl2() {
        System.out.println("UserDaoImpl2 init");
    }

    @Override
    public void play() {

    }
}