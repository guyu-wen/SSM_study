package com.guyu.d_helloProxyPattern;

import com.guyu.helloProxyPattern.*;
import org.junit.jupiter.api.Test;

/**
 * @author      : wenhaojie
 * @date        : 2023/1/5 22:36
 * @description : spring����ģʽԭ��ѧϰ
 */
public class TestHelloProxyPattern {
    /**
     * @description: �����ô���ģʽ�ķ�ʽ
     * @author: wenhaojie
     * @date: 2023/1/5 22:40
     **/
    @Test
    public void testCalculator(){
        Calculator calculator = new CalculatorPureImpl();
        calculator.add(1,2);
        /*
       �����д���ȱ��
            ��Դ���־���ܵ�ʵ���࣬���Ƿ���������ȱ�ݣ�
            �Ժ���ҵ�����и��ţ����³���Ա�ڿ�������ҵ����ʱ��ɢ�˾���
            ���ӹ��ܷ�ɢ�ڸ���ҵ���ܷ����У�������ͳһά��
        �ڽ��˼·
            ������������⣬���ľ��ǣ����������Ҫ�Ѹ��ӹ��ܴ�ҵ���ܴ����г�ȡ������
        ������
            �����������ѣ�Ҫ��ȡ�Ĵ����ڷ����ڲ�������ǰ�������е��ظ������ȡ������ķ�ʽû�������
            ������Ҫ�����µļ�����
        */
    }

    /**
     * @description: ��̬����
     * @author: wenhaojie
     * @date: 2023/1/5 22:40
     **/
    @Test
    public void testStaticProxy(){
        Calculator calculator = new CalculatorStaticProxy(new CalculatorPureImpl1());
        calculator.add(1,2);
        /*
         * ̬����ȷʵʵ���˽���������ڴ��붼д���ˣ���ȫ���߱��κε�����ԡ�������־������˵�����������ط�Ҳ��Ҫ������־��
         * �ǻ����������������̬�����࣬�ǾͲ����˴����ظ��Ĵ��룬��־���ܻ��Ƿ�ɢ�ģ�û��ͳһ����
         * �����һ�������󣺽���־���ܼ��е�һ���������У��������κ���־���󣬶�ͨ����һ����������ʵ�֡������Ҫʹ�ö�̬�������ˡ�
        */
    }

    /**
     * @description: ��̬����
     * @author: wenhaojie
     * @date: 2023/1/5 22:40
     **/
    @Test
    public void testProxy(){

        ProxyFactory factory = new ProxyFactory(new CalculatorPureImpl1());
        Calculator proxy = (Calculator) factory.getProxy();
        proxy.div(1, 1);
        /*
         �� ��̬����;�̬�����ɫһ��
        �� ��̬����Ĵ������Ƕ�̬���ɵģ���������ֱ��д�õģ�
        �� ��̬�����Ϊ�����ࣺ���ڽӿڵĶ�̬����������Ķ�̬����
        �� ���ڽӿ� �� JDK��̬��������������ʹ�á�
        �������ࣺcglib
        ����������
            ��JDK��̬����Ҫ������нӿڣ��������ɵĴ�������com.sun.proxy���£�����$Proxy2
            ��cglib���������ɵĴ������̳�Ŀ���࣬���Һ�Ŀ��������ͬ�İ���
         */
    }

}