package com.guyu.helloAOP;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author : wenhaojie
 * @date : 2023/1/7 15:20
 * @description : ������
 */
@Component // @Componentע�Ᵽ֤����������ܹ�����IOC����
@Aspect // @Aspect��ʾ�������һ��������
public class LogAspect {
//    @Pointcut("execution(public int com.guyu.helloAOP.CalculatorPureImpl2.*(..))")
//    public void pointCut() {
//    }

    @Before("execution(public int com.guyu.helloAOP.CalculatorPureImpl2.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        String s = Arrays.toString(joinPoint.getArgs());
        System.out.println("Logger-->ǰ��֪ͨ����������" + name + "��������" + s);
    }

    @After("execution(public int com.guyu.helloAOP.CalculatorPureImpl2.*(..))")
    public void afterMethod(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println("Logger-->����֪ͨ����������" + name);
    }

    @AfterReturning(value = "execution(public int com.guyu.helloAOP.CalculatorPureImpl2.*(..))", returning = "result")
    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
        String name = joinPoint.getSignature().getName();
        System.out.println("Logger-->����֪ͨ����������" + name + "�����" + result);
    }

    @AfterThrowing(value = "execution(public int com.guyu.helloAOP.CalculatorPureImpl2.*(..))", throwing = "ex")
    public void afterThrowingMehtod(JoinPoint joinPoint, Throwable ex) {
        String name = joinPoint.getSignature().getName();
        System.out.println("Logger-->�쳣֪ͨ����������" + name + "�쳣��" + ex);
    }

    @Around("execution(public int com.guyu.helloAOP.CalculatorPureImpl2.*(..))")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        Object result = null;
        try {
            System.out.println("����֪ͨ-->Ŀ����󷽷�ִ��֮ǰ");
            //Ŀ��������ӵ㣩������ִ��
            result = joinPoint.proceed();
            System.out.println("����֪ͨ-->Ŀ����󷽷�����ֵ֮��");
        } catch (Throwable e) {
            System.out.println("����֪ͨ-->Ŀ����󷽷������쳣ʱ");
            throw new RuntimeException(e);
        } finally {
            System.out.println("����֪ͨ-->Ŀ����󷽷�ִ�����");
        }
        return result;
    }
}