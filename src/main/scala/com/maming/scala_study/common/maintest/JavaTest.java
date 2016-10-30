package com.maming.scala_study.common.maintest;


import com.maming.scala_study.collection.SetTest;
import com.maming.scala_study.common.functiontest.FlatMapTest;
import com.maming.scala_study.common.functiontest.MapFunctionTest;
import com.maming.scala_study.common.functiontest.fortest;

/**
 * Created by maming on 2016/7/17.
 */
public class JavaTest {

    public void test1(){
        fortest test = new fortest();
//        test.sayHello("hello world");
//        test.arrayfor();
//        test.arrayfor();
        test.filterTest1();
    }

    public void test2(){
        MapFunctionTest test = new MapFunctionTest();
        test.mapFunction();
    }

    public void test3(){
        SetTest test = new SetTest();
        test.initSet();;
    }

    public void test4(){
        FlatMapTest test = new FlatMapTest();
        test.initFlatMap();;
    }

    public static void main(String[] args) {
        JavaTest test = new JavaTest();
        test.test4();
    }
}
