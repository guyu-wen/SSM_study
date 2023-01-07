package com.guyu.d_helloProxyPattern;

import com.guyu.helloProxyPattern.*;
import org.junit.jupiter.api.Test;

/**
 * @author      : wenhaojie
 * @date        : 2023/1/5 22:36
 * @description : spring代理模式原理学习
 */
public class TestHelloProxyPattern {
    /**
     * @description: 不适用代理模式的方式
     * @author: wenhaojie
     * @date: 2023/1/5 22:40
     **/
    @Test
    public void testCalculator(){
        Calculator calculator = new CalculatorPureImpl();
        calculator.add(1,2);
        /*
       ①现有代码缺陷
            针对带日志功能的实现类，我们发现有如下缺陷：
            对核心业务功能有干扰，导致程序员在开发核心业务功能时分散了精力
            附加功能分散在各个业务功能方法中，不利于统一维护
        ②解决思路
            解决这两个问题，核心就是：解耦。我们需要把附加功能从业务功能代码中抽取出来。
        ③困难
            解决问题的困难：要抽取的代码在方法内部，靠以前把子类中的重复代码抽取到父类的方式没法解决。
            所以需要引入新的技术。
        */
    }

    /**
     * @description: 静态代理
     * @author: wenhaojie
     * @date: 2023/1/5 22:40
     **/
    @Test
    public void testStaticProxy(){
        Calculator calculator = new CalculatorStaticProxy(new CalculatorPureImpl1());
        calculator.add(1,2);
        /*
         * 态代理确实实现了解耦，但是由于代码都写死了，完全不具备任何的灵活性。就拿日志功能来说，将来其他地方也需要附加日志，
         * 那还得再声明更多个静态代理类，那就产生了大量重复的代码，日志功能还是分散的，没有统一管理。
         * 提出进一步的需求：将日志功能集中到一个代理类中，将来有任何日志需求，都通过这一个代理类来实现。这就需要使用动态代理技术了。
        */
    }

    /**
     * @description: 动态代理
     * @author: wenhaojie
     * @date: 2023/1/5 22:40
     **/
    @Test
    public void testProxy(){

        ProxyFactory factory = new ProxyFactory(new CalculatorPureImpl1());
        Calculator proxy = (Calculator) factory.getProxy();
        proxy.div(1, 1);
        /*
         · 动态代理和静态代理角色一样
        · 动态代理的代理类是动态生成的，不是我们直接写好的！
        · 动态代理分为两大类：基于接口的动态代理，基于类的动态代理
        · 基于接口 — JDK动态代理【我们在这里使用】
        ·基于类：cglib
        ·两个区别
            ·JDK动态代理：要求必须有接口，最终生成的代理类在com.sun.proxy包下，类名$Proxy2
            ·cglib：最终生成的代理类会继承目标类，并且和目标类在相同的包下
         */
    }

}