package com.guyu.helloProxyPattern;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author : wenhaojie
 * @date : 2023/1/5 22:48
 * @description : some description
 */
public class ProxyFactory {


    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        /**
         * newProxyInstance()������һ������ʵ��
         * ����������������
         * 1��classLoader�����ض�̬���ɵĴ�������������
         * 2��interfaces��Ŀ�����ʵ�ֵ����нӿڵ�class��������ɵ�����
         * 3��invocationHandler�����ô������ʵ��Ŀ����󷽷��Ĺ��̣����������������д��
         ���еĳ��󷽷�
         */

        ClassLoader loader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                /**
                 * proxy���������
                 * method�����������Ҫʵ�ֵķ�������������Ҫ��д�ķ���
                 * args��method����Ӧ�����Ĳ���
                 */
                Object result = null;
                try {
                    System.out.println("[��̬����][��־] " + method.getName() + "��������" + Arrays.toString(args));
                    result = method.invoke(target, args);
                    System.out.println("[��̬����][��־] " + method.getName() + "�������" + result);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("[��̬����][��־] " + method.getName() + "���쳣��" + e.getMessage());
                } finally {
                    System.out.println("[��̬����][��־] " + method.getName() + "������ִ�����");
                }
                return result;
            }
        };

        return Proxy.newProxyInstance(loader, interfaces, invocationHandler);
    }

}