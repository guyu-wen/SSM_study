package com.guyu.a_helloXmlDI;

import com.guyu.helloXmlDI.*;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestDIGetBeanByXML_01 {
    @Test
    /** ����geter��seterע��
     * @description: ��ȡbean�����ַ�ʽ
     * @author: guyu
     * @date: 2023/1/3 11:16
     **/
    void testDIGetter() {
        ApplicationContext ac= new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //�ٷ�ʽһ������id��ȡ
        HelloWorld helloworld = (HelloWorld) ac.getBean("helloworld");
        helloworld.sayHello();

        //�ڷ�ʽ�����������ͻ�ȡ
        //��ע��
        //���������ͻ�ȡbeanʱ��Ҫ��IOC������ָ�����͵�bean����ֻ����һ��
        //��IOC������һ�������������ᱨ��
        HelloWorld helloworld2 = (HelloWorld) ac.getBean(HelloWorld.class);
        helloworld2.sayHello();

        //3.�۷�ʽ��������id������
        HelloWorld helloworld3 = ac.getBean("helloworld", HelloWorld.class);
        helloworld3.sayHello();

//        ����չ
//
//        ��������ʵ���˽ӿڣ����ݽӿ����Ϳ��Ի�ȡ bean ��
//        ���ԣ�ǰ����beanΨһ
//
//        ���һ���ӿ��ж��ʵ���࣬��Щʵ���඼������ bean�����ݽӿ����Ϳ��Ի�ȡ bean ��
//        ���У���Ϊbean��Ψһ
//
//          �޽���
//        ������������ȡbeanʱ��������beanΨһ�Ե�ǰ���£���ʵֻ�ǿ��������� instanceof ָ�������͡��ķ��ؽ����ֻҪ���ص���true�Ϳ����϶�Ϊ������ƥ�䣬�ܹ���ȡ����

    }

    /**
     * @description: ����������ע��
     * @author: guyu
     * @date: 2023/1/3 11:18
     **/
    @Test
    public void testDIConstructorArgs(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ExampleBean bean = context.getBean(ExampleBean.class);
        System.out.println(bean);
    }

    /**
     * @description: ����ֵ����ע��
     * @author: guyu
     * @date: 2023/1/3 11:18
     **/
    @Test
    public void testDISpecialValues(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Student student = context.getBean("Student", Student.class);
        System.out.println(student);
    }
    @Test
    public void testDISpecialValues2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Student student = context.getBean("StudentOne", Student.class);
        System.out.println(student);
    }
    @Test
    public void testDISpecialValues3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Student student = context.getBean("StudentThree", Student.class);
        System.out.println(student);
    }

    @Test
    public void testListDIValues(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Clazz clazz = context.getBean("clazzTwo", Clazz.class);
        System.out.println(clazz);
    }

    @Test
    public void testMapDIValues() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Student student = context.getBean("studentFour", Student.class);
        System.out.println(student);
    }

    @Test
    public void testUtilNameSpaceDIValues(){//ʹ��util:list��util:map��ǩ����������Ӧ�������ռ䣬����ͨ��idea����ʾ����ѡ��
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Clazz clazz = context.getBean("clazzTwo", Clazz.class);
        System.out.println(clazz);
    }
    @Test
    public void testPNameSpaceDIValues(){//ʹ��util:list��util:map��ǩ����������Ӧ�������ռ䣬����ͨ��idea����ʾ����ѡ��
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Teacher teacherThree = context.getBean("teacherThree", Teacher.class);
        System.out.println(teacherThree);
    }
    @Test
    public void testCNameSpaceDIValues(){//ʹ��util:list��util:map��ǩ����������Ӧ�������ռ䣬����ͨ��idea����ʾ����ѡ��
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Teacher teacherThree = context.getBean("teacherThree", Teacher.class);
        System.out.println(teacherThree);
    }

}