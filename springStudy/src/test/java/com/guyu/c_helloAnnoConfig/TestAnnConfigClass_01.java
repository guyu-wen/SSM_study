package com.guyu.c_helloAnnoConfig;

import com.guyu.helloAnnoConfig.JavaConfig;
import com.guyu.helloAnnoConfig.JavaConfig2;
import com.guyu.helloAnnoConfig.JavaConfig3;
import com.guyu.helloAnnoConfig.MySQLConfig;
import com.guyu.helloAnnoConfig.pojo.User;
import com.guyu.helloAnnoConfig.pojo2.User2;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * @author : guyu，
 * @date : 2023/1/5 21:08
 * @description : 注解配置
 */
public class TestAnnConfigClass_01 {
    /**
     * @description: @Configuration的作用
     * @Configuration用于定义配置类，可替换xml配置文件，被注解的类内部包含有一个或多个被@Bean注解的方法，
     * 这些方法将会被AnnotationConfigApplicationContext或AnnotationConfigWebApplicationContext类进行扫描，
     * 并用于构建bean定义，初始化Spring容器。
     * @Configuration 这个也会被Spring容器托管 注册到容器中 因为它本来就是一个@Component
     * ·@Configuration 代表这是一个配置类，就和之前的xml配置文件一样
     * @author: guyu
     * @date: 2023/1/5 21:12
     **/
    @Test
    public void testConfiguration() {
        ApplicationContext context = new
                AnnotationConfigApplicationContext(JavaConfig.class);
        User user = context.getBean("getUser", User.class);
        System.out.println(user.getName());
    }

    /**
     * @description: @Bean的作用 将这个类或者方法注册到spring IoC容器中，
     *              这个配置就等同于之前在xml里的配置
     * @author: guyu
     * @date: 2023/1/5 21:10
     **/
    @Test
    public void testBeanAnno() {
        //见上一个函数
    }
    /**
     * @description: @componentscan的作用
     *     @ComponentScan告诉Spring 哪个packages 用注解标识的类 ,
     *     会被spring自动扫描并且装入bean容器。
     *     如果你有个类用@Controller注解标识了，那么配置类不加上@ComponentScan指定包，
     *     无法自动扫描该controller，那么该Controller就不会被spring扫描到，
     *     更不会装入spring容器中，因此你配置的这个Controller也没有意义
     * @author: guyu
     * @date: 2023/1/5 21:18
     **/
    @Test
    public void testComponentScanAnno() {
        ApplicationContext context = new
                AnnotationConfigApplicationContext(JavaConfig2.class);
            User2 user = context.getBean("getUser", User2.class);
        System.out.println(user.getName());
    }

    /**
     * @description:  @Import的作用
     *                  传入其他自定义配置类
     * @author: guyu
     * @date: 2023/1/5 21:40
     **/
    @Test
    public void testImportAnno() {
        //如果完全使用配置类的方式去做，我们就只能通过ApplicationContext 上下文来获取容器，通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig3.class);
        User2 user = context.getBean("getUser", User2.class);
        System.out.println(user.getName());
    }

    /**
     * @description:  @PropertySource("mysql.properties")
     * @author: guyu
     * @date: 2023/1/5 21:40
     **/
    @Test
    public void testPropertySourceAnno() {
        //如果完全使用配置类的方式去做，我们就只能通过ApplicationContext 上下文来获取容器，通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(MySQLConfig.class);
        DataSource dataSource = context.getBean("getDruidDataSource", DataSource.class);
        System.out.println(dataSource);
    }
}