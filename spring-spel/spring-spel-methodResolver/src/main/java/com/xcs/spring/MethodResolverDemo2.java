package com.xcs.spring;

import org.springframework.core.convert.TypeDescriptor;
import org.springframework.expression.AccessException;
import org.springframework.expression.MethodExecutor;
import org.springframework.expression.MethodResolver;
import org.springframework.expression.spel.support.ReflectiveMethodResolver;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.Arrays;
import java.util.List;

/**
 * @author 周立伟
 * @since 2024-08-05 15:33
 */
public class MethodResolverDemo2 {

    public static void main(String[] args) throws AccessException {

        ReflectiveMethodResolver methodResolver = new ReflectiveMethodResolver();
        StandardEvaluationContext context = new StandardEvaluationContext();
        MyBean myBean = new MyBean();
        List<TypeDescriptor> typeDescriptors = Arrays.asList(TypeDescriptor.valueOf(Integer.class), TypeDescriptor.valueOf(Integer.class));
        MethodExecutor methodExecutor = methodResolver.resolve(context, myBean, "add", typeDescriptors);
        Object value = methodExecutor.execute(context, myBean, 1, 1).getValue();
        System.out.println("value = " + value);
    }

}
