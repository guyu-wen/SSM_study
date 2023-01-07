package com.guyu.helloProxyPattern;

/**
 * @author : wenhaojie
 * @date : 2023/1/5 22:33
 * @description : 计算器接口实现类并分别添加对应日志信息
 */
public class CalculatorPureImpl implements Calculator {
    @Override
    public int add(int i, int j) {
        System.out.println("[日志] add 方法开始了，参数是" + i + "," + j);
        int result = i + j;
        System.out.println("方法内部result=" + result);
        System.out.println("[日志] add 方法结束了，结果是" + result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("[日志] sub 方法开始了，参数是" + i + "," + j);
        int result = i - j;
        System.out.println("方法内部result=" + result);
        System.out.println("[日志] sub 方法结束了，结果是" + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("[日志] mul 方法开始了，参数是" + i + "," + j);
        int result = i * j;
        System.out.println("方法内部result=" + result);
        System.out.println("[日志] mul 方法结束了，结果是" + result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("[日志] div 方法开始了，参数是" + i + "," + j);
        int result = i / j;
        System.out.println("方法内部result=" + result);
        System.out.println("[日志] div 方法结束了，结果是" + result);
        return result;
    }

}