package com.guyu.b_helloAnnoDI;

import com.guyu.helloAnnoDI.controller.UserController;
import com.guyu.helloAnnoDI.dao.UserDao;
import com.guyu.helloAnnoDI.dao.impl.UserDaoImpl;
import com.guyu.helloAnnoDI.dao.impl.UserDaoImpl2;
import com.guyu.helloAnnoDI.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class B_TestDIGetBeanByAnno {

    /**
     * @description: 最基本的注解扫描方式
     * @author: wenhaojie
     * @date: 2023/1/4 23:15
     * @param:
     * @return:
     **/
    @Test
    void testDIBasicAnnoScanner() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext-Anno.xml");

        UserServiceImpl userServiceser = context.getBean(UserServiceImpl.class);
        UserController userController = context.getBean(UserController.class);
        UserDao userDaoImpl = context.getBean(UserDaoImpl.class);
        //报错所以排除
        //UserDaoImpl2 userDaoImpl2 = context.getBean(UserDaoImpl2.class);
    }

    @Test
    void testDIAnnoAutowired() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext-Anno.xml");

        UserServiceImpl userServiceser = context.getBean(UserServiceImpl.class);

        //不能获得对应的文件
        UserController userController = context.getBean(UserController.class);
        UserDao userDaoImpl = context.getBean(UserDaoImpl.class);
    }

    //@Autowired注解可以标记在构造器和set方法上
}