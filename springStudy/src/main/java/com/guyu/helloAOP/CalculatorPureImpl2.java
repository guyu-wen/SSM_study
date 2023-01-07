package com.guyu.helloAOP;

import org.springframework.stereotype.Component;

/**
 * @author : wenhaojie
 * @date : 2023/1/5 22:33
 * @description : �������ӿ�ʵ���ಢ�ֱ���Ӷ�Ӧ��־��Ϣ
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