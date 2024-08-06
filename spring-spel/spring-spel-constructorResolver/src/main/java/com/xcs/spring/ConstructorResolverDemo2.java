package com.xcs.spring;

import org.springframework.core.convert.TypeDescriptor;
import org.springframework.expression.AccessException;
import org.springframework.expression.ConstructorExecutor;
import org.springframework.expression.spel.support.ReflectiveConstructorResolver;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.Collections;

/**
 * @author xcs
 * @date 2024年3月12日11:28:47
 **/
public class ConstructorResolverDemo2 {
    public static void main(String[] args) throws AccessException {

        StandardEvaluationContext evalContext = new StandardEvaluationContext();

        ReflectiveConstructorResolver resolver = new ReflectiveConstructorResolver();
        TypeDescriptor typeDescriptor = TypeDescriptor.valueOf(String.class);
        ConstructorExecutor constructorExecutor = resolver.resolve(evalContext, "com.xcs.spring.MyBean", Collections.singletonList(typeDescriptor));
        Object bean = constructorExecutor.execute(evalContext, "ConstructorResolverDemo2").getValue();

        // 打印输出实例化的MyBean对象
        System.out.println(bean);
    }
}
