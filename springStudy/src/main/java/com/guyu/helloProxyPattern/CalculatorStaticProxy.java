package com.guyu.helloProxyPattern;
/**
 * @author      : wenhaojie
 * @date        : 2023/1/5 22:42
 * @description : ��̬����
 */
public class CalculatorStaticProxy implements Calculator{

    // ���������Ŀ���������Ϊ��Ա����
    private Calculator target;

    public CalculatorStaticProxy(Calculator target) {
        this.target = target;
    }

    @Override
    public int add(int i, int j) {
        // ���ӹ����ɴ������еĴ�������ʵ��
        System.out.println("[��־] add ������ʼ�ˣ������ǣ�" + i + "," + j);
        // ͨ��Ŀ�������ʵ�ֺ���ҵ���߼�
        int addResult = target.add(i, j);
        System.out.println("[��־] add ���������ˣ�����ǣ�" + addResult);
        return addResult;    }

    @Override
    public int sub(int i, int j) {
        return 0;
    }

    @Override
    public int mul(int i, int j) {
        return 0;
    }

    @Override
    public int div(int i, int j) {
        return 0;
    }
}