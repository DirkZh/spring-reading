package com.xcs.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author xcs
 * @date 2023年09月21日 10时30分
 **/
@Component
public class MyServiceB {

    @Autowired
    private MyServiceA myServiceA;

    @Override
    public String toString() {
        return "MyServiceB@" + Integer.toHexString(hashCode()) + "{" +
                "myServiceA=" + myServiceA +
                '}';
    }
}
