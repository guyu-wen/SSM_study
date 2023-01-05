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
 * @author : guyu��
 * @date : 2023/1/5 21:08
 * @description : ע������
 */
public class TestAnnConfigClass_01 {
    /**
     * @description: @Configuration������
     * @Configuration���ڶ��������࣬���滻xml�����ļ�����ע������ڲ�������һ��������@Beanע��ķ�����
     * ��Щ�������ᱻAnnotationConfigApplicationContext��AnnotationConfigWebApplicationContext�����ɨ�裬
     * �����ڹ���bean���壬��ʼ��Spring������
     * @Configuration ���Ҳ�ᱻSpring�����й� ע�ᵽ������ ��Ϊ����������һ��@Component
     * ��@Configuration ��������һ�������࣬�ͺ�֮ǰ��xml�����ļ�һ��
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
     * @description: @Bean������ ���������߷���ע�ᵽspring IoC�����У�
     *              ������þ͵�ͬ��֮ǰ��xml�������
     * @author: guyu
     * @date: 2023/1/5 21:10
     **/
    @Test
    public void testBeanAnno() {
        //����һ������
    }
    /**
     * @description: @componentscan������
     *     @ComponentScan����Spring �ĸ�packages ��ע���ʶ���� ,
     *     �ᱻspring�Զ�ɨ�貢��װ��bean������
     *     ������и�����@Controllerע���ʶ�ˣ���ô�����಻����@ComponentScanָ������
     *     �޷��Զ�ɨ���controller����ô��Controller�Ͳ��ᱻspringɨ�赽��
     *     ������װ��spring�����У���������õ����ControllerҲû������
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
     * @description:  @Import������
     *                  ���������Զ���������
     * @author: guyu
     * @date: 2023/1/5 21:40
     **/
    @Test
    public void testImportAnno() {
        //�����ȫʹ��������ķ�ʽȥ�������Ǿ�ֻ��ͨ��ApplicationContext ����������ȡ������ͨ���������class�������
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
        //�����ȫʹ��������ķ�ʽȥ�������Ǿ�ֻ��ͨ��ApplicationContext ����������ȡ������ͨ���������class�������
        ApplicationContext context = new AnnotationConfigApplicationContext(MySQLConfig.class);
        DataSource dataSource = context.getBean("getDruidDataSource", DataSource.class);
        System.out.println(dataSource);
    }
}