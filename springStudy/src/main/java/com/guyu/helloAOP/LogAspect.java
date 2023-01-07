package com.guyu.helloAOP;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author : wenhaojie
 * @date : 2023/1/7 15:20
 * @description : 切面类
 */
@Component // @Component注解保证这个切面类能够放入IOC容器
@Aspect // @Aspect表示这个类是一个切面类
public class LogAspect {
//    @Pointcut("execution(public int com.guyu.helloAOP.CalculatorPureImpl2.*(..))")
//    public void pointCut() {
//    }

    @Before("execution(public int com.guyu.helloAOP.CalculatorPureImpl2.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        String s = Arrays.toString(joinPoint.getArgs());
        System.out.println("Logger-->前置通知，方法名：" + name + "，参数：" + s);
    }

    @After("execution(public int com.guyu.helloAOP.CalculatorPureImpl2.*(..))")
    public void afterMethod(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println("Logger-->后置通知，方法名：" + name);
    }

    @AfterReturning(value = "execution(public int com.guyu.helloAOP.CalculatorPureImpl2.*(..))", returning = "result")
    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
        String name = joinPoint.getSignature().getName();
        System.out.println("Logger-->返回通知，方法名：" + name + "结果：" + result);
    }

    @AfterThrowing(value = "execution(public int com.guyu.helloAOP.CalculatorPureImpl2.*(..))", throwing = "ex")
    public void afterThrowingMehtod(JoinPoint joinPoint, Throwable ex) {
        String name = joinPoint.getSignature().getName();
        System.out.println("Logger-->异常通知，方法名：" + name + "异常：" + ex);
    }

    @Around("execution(public int com.guyu.helloAOP.CalculatorPureImpl2.*(..))")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        Object result = null;
        try {
            System.out.println("环绕通知-->目标对象方法执行之前");
            //目标对象（连接点）方法的执行
            result = joinPoint.proceed();
            System.out.println("环绕通知-->目标对象方法返回值之后");
        } catch (Throwable e) {
            System.out.println("环绕通知-->目标对象方法出现异常时");
            throw new RuntimeException(e);
        } finally {
            System.out.println("环绕通知-->目标对象方法执行完毕");
        }
        return result;
    }
}