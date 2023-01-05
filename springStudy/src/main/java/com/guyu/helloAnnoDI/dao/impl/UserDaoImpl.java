package com.guyu.helloAnnoDI.dao.impl;

import com.guyu.helloAnnoDI.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author      : guyu
 * @date        : 2023/1/4 23:00
 * @description : some description
 */
@Repository
public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
        this.play();
        System.out.println("UserDaoImpl init.....");
    }

    @Override
    public void play(){
        System.out.println("UserDaoImpl play().....");

    }
}