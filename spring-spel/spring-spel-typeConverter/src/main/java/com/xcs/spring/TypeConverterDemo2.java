package com.xcs.spring;

import org.springframework.core.convert.TypeDescriptor;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.expression.spel.support.StandardTypeConverter;

public class TypeConverterDemo2 {

    public static void main(String[] args) {

        StandardTypeConverter typeConverter = new StandardTypeConverter();
        Object value = typeConverter.convertValue("12", TypeDescriptor.valueOf(String.class), TypeDescriptor.valueOf(Double.class));
        System.out.println("value = " + value);

    }
}
