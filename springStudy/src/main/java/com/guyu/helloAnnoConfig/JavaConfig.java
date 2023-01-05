package com.guyu.helloAnnoConfig;

import com.guyu.helloAnnoConfig.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author      : guyu
 * @date        : 2023/1/5 21:21
 * @description : some description
 */
@Configuration // 代表这是一个Spring的配置类
public class JavaConfig {
    @Bean
    public User getUser() {
        return new User();
    }
}