package com.xcs.spring;

import com.xcs.spring.config.MyConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xcs
 * @date 2023年09月16日 16时09分
 **/
public class GetBeanApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        System.out.println("myServiceA--1 = " + context.getBean("myServiceA"));
        System.out.println("myServiceA--2 = " + context.getBean("myServiceA"));
        System.out.println("myServiceB--1 = " + context.getBean("myServiceB"));
        System.out.println("myServiceB--2 = " + context.getBean("myServiceB"));
    }
}
