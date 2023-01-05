package com.guyu.helloAnnoConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author      : guyu
 * @date        : 2023/1/5 21:21
 * @description : some description
 */
@Configuration // 代表这是一个Spring的配置类
@ComponentScan("com.guyu.helloAnnoConfig.pojo2") // 需要扫描的包
public class JavaConfig2 {

}