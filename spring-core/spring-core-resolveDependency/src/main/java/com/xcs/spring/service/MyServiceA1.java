package com.xcs.spring.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Priority;

/**
 * @author xcs
 * @date 2023年10月25日 10时36分
 **/
@Lazy
@Priority(1)
@Service
public class MyServiceA1 implements MyServiceA, InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyService1 初始化完成");
    }
}
