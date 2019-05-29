package com.song.erp.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class LambdaTest {

    public static void main(String[] args) {
        test01();
    }


    public static void test02(){
        DongErpUser dongErpUser = new DongErpUser();
        Integer integer = new Integer(22);
        dongErpUser.setSex(integer);
    }


    public static void test01(){
        List<Apple> appleList = new ArrayList<Apple>();
        appleList.add(new Apple("green",200));
        appleList.add(new Apple("red",100));
        appleList.add(new Apple("blue",400));
        appleList.add(new Apple("yellow",300));

        // 1、行为参数化、
//        appleList.sort(new AppleCompare());
        // 2、匿名类、
//        appleList.sort(new Comparator<Apple>() {
//            @Override
//            public int compare(Apple o1, Apple o2) {
//                return o1.getWeight()-o2.getWeight();
//            }
//        });
        // 3、Lambda 表达式
//        appleList.sort((Apple o1,Apple o2)->o1.getWeight().compareTo(o2.getWeight()));
        // 4、方法引用。
        appleList.sort((o1,o2)->o1.getWeight().compareTo(o2.getWeight()));
        // 我们想要实现的终解决方案是这样的
        //appleList.sort(comparing(Apple::getWeight));

        for(Apple apple:appleList){
            System.out.println(apple.toString());
        }

    }

    public static class AppleCompare implements Comparator<Apple>, Serializable {
        private static final long serialVersionUID = -3752467430485354679L;

        @Override
        public int compare(Apple o1, Apple o2) {
            return o1.getWeight()-o2.getWeight();
        }
    }
}
