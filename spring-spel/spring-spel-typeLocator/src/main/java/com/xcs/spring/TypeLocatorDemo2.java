package com.xcs.spring;

import org.springframework.expression.spel.support.StandardTypeLocator;

public class TypeLocatorDemo2 {
    public static void main(String[] args) {

        StandardTypeLocator typeLocator = new StandardTypeLocator();
        Class<?> type = typeLocator.findType("java.util.Date");
        System.out.println(type);

    }
}
