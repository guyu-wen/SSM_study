package com.guyu.a_helloXmlDI;

import com.guyu.helloXmlDI.*;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestDIGetBeanByXML_01 {
    @Test
    /** 依赖geter、seter注入
     * @description: 获取bean的三种方式
     * @author: guyu
     * @date: 2023/1/3 11:16
     **/
    void testDIGetter() {
        ApplicationContext ac= new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //①方式一：根据id获取
        HelloWorld helloworld = (HelloWorld) ac.getBean("helloworld");
        helloworld.sayHello();

        //②方式二：根据类型获取
        //④注意
        //当根据类型获取bean时，要求IOC容器中指定类型的bean有且只能有一个
        //当IOC容器中一共配置了两个会报错
        HelloWorld helloworld2 = (HelloWorld) ac.getBean(HelloWorld.class);
        helloworld2.sayHello();

        //3.③方式三：根据id和类型
        HelloWorld helloworld3 = ac.getBean("helloworld", HelloWorld.class);
        helloworld3.sayHello();

//        ⑤扩展
//
//        如果组件类实现了接口，根据接口类型可以获取 bean 吗？
//        可以，前提是bean唯一
//
//        如果一个接口有多个实现类，这些实现类都配置了 bean，根据接口类型可以获取 bean 吗？
//        不行，因为bean不唯一
//
//          ⑥结论
//        根据类型来获取bean时，在满足bean唯一性的前提下，其实只是看：『对象 instanceof 指定的类型』的返回结果，只要返回的是true就可以认定为和类型匹配，能够获取到。

    }

    /**
     * @description: 依赖构造器注入
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
     * @description: 特殊值依赖注入
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
    public void testUtilNameSpaceDIValues(){//使用util:list、util:map标签必须引入相应的命名空间，可以通过idea的提示功能选择
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Clazz clazz = context.getBean("clazzTwo", Clazz.class);
        System.out.println(clazz);
    }
    @Test
    public void testPNameSpaceDIValues(){//使用util:list、util:map标签必须引入相应的命名空间，可以通过idea的提示功能选择
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Teacher teacherThree = context.getBean("teacherThree", Teacher.class);
        System.out.println(teacherThree);
    }
    @Test
    public void testCNameSpaceDIValues(){//使用util:list、util:map标签必须引入相应的命名空间，可以通过idea的提示功能选择
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Teacher teacherThree = context.getBean("teacherThree", Teacher.class);
        System.out.println(teacherThree);
    }

}