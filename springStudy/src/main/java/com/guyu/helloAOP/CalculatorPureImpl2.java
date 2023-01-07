package com.guyu.helloAOP;

import org.springframework.stereotype.Component;

/**
 * @author : wenhaojie
 * @date : 2023/1/5 22:33
 * @description : 计算器接口实现类并分别添加对应日志信息
 */
@Component("target")
public class CalculatorPureImpl2 implements Calculator {
    @Override
    public int add(int i, int j) {
        int result = i + j;
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = i / j;
        return result;
    }

}