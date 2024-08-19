package com.xcs.spring.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author xcs
 * @date 2023年10月25日 10时36分
 **/
@Primary
@Service
public class MyServiceA2 implements MyServiceA, InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyService2 初始化完成");
    }
}
