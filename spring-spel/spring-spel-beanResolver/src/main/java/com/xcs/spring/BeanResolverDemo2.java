package com.xcs.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.expression.BeanFactoryResolver;
import org.springframework.expression.AccessException;
import org.springframework.expression.BeanResolver;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class BeanResolverDemo2 {
    public static void main(String[] args) throws AccessException {

        BeanFactory beanFactory = new AnnotationConfigApplicationContext(MyBean.class).getBeanFactory();

        BeanFactoryResolver resolver = new BeanFactoryResolver(beanFactory);

        StandardEvaluationContext context = new StandardEvaluationContext();

        Object myBean = resolver.resolve(context, "myBean");
        System.out.println(myBean);

    }
}
