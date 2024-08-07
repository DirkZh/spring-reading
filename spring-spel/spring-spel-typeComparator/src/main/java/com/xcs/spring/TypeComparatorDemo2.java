package com.xcs.spring;

import org.springframework.expression.spel.support.StandardTypeComparator;

public class TypeComparatorDemo2 {
    public static void main(String[] args) {

        StandardTypeComparator comparator = new StandardTypeComparator();
        boolean canCompare = comparator.canCompare("123", "321");
        System.out.println("canCompare = " + canCompare);
        int compare = comparator.compare("123", "321");
        System.out.println("compare = " + compare);

    }
}
