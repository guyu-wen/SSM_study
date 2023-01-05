package com.guyu.helloAnnoConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author      : wenhaojie
 * @date        : 2023/1/5 21:41
 * @description : some description
 */
@Configuration
@Import(JavaConfig2.class)
public class JavaConfig3 {
}