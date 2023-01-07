package com.guyu.e_hellpAOP;

import com.guyu.helloAOP.Calculator;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author : wenhaojie
 * @date : 2023/1/5 22:36
 * @description : spring代理模式原理学习
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ApplicationContext-AOP.xml")
public class TestHelloAOP {

    @Autowired
    private Calculator calculator;

    /**
     * @description: 依赖注解的方式实现AOP
     * @author: wenhaojie 
     * @date: 2023/1/7 20:07
     **/
    @Test
    public void testCalculator() {

        int add = calculator.add(1, 3);
        System.out.println("***************************" + add);

        int sub = calculator.sub(1, 3);
        System.out.println("***************************" + sub);

        int mul = calculator.mul(1, 3);
        System.out.println("***************************" + mul);

        int div = calculator.div(1, 3);
        System.out.println("***************************" + div);

    }


}