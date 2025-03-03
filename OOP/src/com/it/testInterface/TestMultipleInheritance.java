package com.it.testInterface;

import java.util.concurrent.Callable;

public class TestMultipleInheritance {
    public static void main(String[] args) {
        C c = new CIml01();
        c.testC();
        c.testA();
        c.testB();
    }
}

interface A{
    void testA();
}
interface B{
    void testB();
}
interface C extends A,B {
    void testC();
}

class CIml01 implements C{ // 因为C继承了A, B所以CIml01需要实现testA,testB,testC

    @Override
    public void testC() {
        System.out.println("CIml01.testC");
    }

    @Override
    public void testA() {
        System.out.println("CIml01.testA");
    }

    @Override
    public void testB() {
        System.out.println("CIml01.testB");
    }
}