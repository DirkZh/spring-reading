package com.xcs.spring.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.naming.spi.InitialContextFactory;

/**
 * @author xcs
 * @date 2023年09月21日 10时30分
 **/
@Scope("prototype")
@Component
public class MyServiceA implements InitializingBean {

    @Autowired
    private MyServiceB myServiceB;

    @Override
    public String toString() {
        return "MyServiceA@" + Integer.toHexString(hashCode()) + "{myServiceB=MyServiceB@" + Integer.toHexString(myServiceB.hashCode()) + "}";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
//        System.out.println("afterPropertiesSet：" + this);
    }
}
