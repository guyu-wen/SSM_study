package com.guyu.helloAnnoConfig;

import com.guyu.helloAnnoConfig.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author      : wenhaojie
 * @date        : 2023/1/5 21:21
 * @description : some description
 */
@Configuration // ��������һ��Spring��������
public class JavaConfig {
    @Bean
    public User getUser() {
        return new User();
    }
}