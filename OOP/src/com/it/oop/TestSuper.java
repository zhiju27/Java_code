package com.it.oop;
/**
 * 测试super关键字
 */
public class TestSuper {
    public static void main(String[] args) {
        /*Child c1 = new Child();
        c1.f();*/
        new Child().f();
    }
}
class Father{
    public int value;
    public void f(){
        value = 100;
        System.out.println("Father.value = " + value);
    }
}

class  Child extends Father {
    public int value;
    public int age;
    @Override
    public void f() {
        super.f();
        value = 200;
        System.out.println("Child.value = " + value);
        System.out.println(value);
        System.out.println(super.value);
    }
    public void f2(){
        System.out.println(age);
    }
}
