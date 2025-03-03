package com.it.testInterface;
/**
 * 测试接口中的新特性(默认方法、静态方法)
 */
public interface TestDefault {
    void printInfo();
    default void moren(){
        System.out.println("TestDefault.moren");
        System.out.println("测试默认方法");
        testStatic01(); // 默认方法中可以调用静态方法

    }

    public static void testStatic01(){
        System.out.println("TestDefault.TestStatic01");
    } // 只能通过接口来调，子类里面没有
}

class TestDefault01 implements TestDefault{

    @Override
    public void printInfo() {
        System.out.println("TestDefault01.printInfo");
    }
}