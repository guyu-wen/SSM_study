package com.guyu.helloProxyPattern;

/**
 * @author : wenhaojie
 * @date : 2023/1/5 22:33
 * @description : �������ӿ�ʵ���ಢ�ֱ���Ӷ�Ӧ��־��Ϣ
 */
public class CalculatorPureImpl implements Calculator {
    @Override
    public int add(int i, int j) {
        System.out.println("[��־] add ������ʼ�ˣ�������" + i + "," + j);
        int result = i + j;
        System.out.println("�����ڲ�result=" + result);
        System.out.println("[��־] add ���������ˣ������" + result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("[��־] sub ������ʼ�ˣ�������" + i + "," + j);
        int result = i - j;
        System.out.println("�����ڲ�result=" + result);
        System.out.println("[��־] sub ���������ˣ������" + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("[��־] mul ������ʼ�ˣ�������" + i + "," + j);
        int result = i * j;
        System.out.println("�����ڲ�result=" + result);
        System.out.println("[��־] mul ���������ˣ������" + result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("[��־] div ������ʼ�ˣ�������" + i + "," + j);
        int result = i / j;
        System.out.println("�����ڲ�result=" + result);
        System.out.println("[��־] div ���������ˣ������" + result);
        return result;
    }

}