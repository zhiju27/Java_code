package com.it.encapsulation.a;

public class Student extends Person {
    public void study(){
        System.out.println(super.TestProtected);
        Person p = new Person();
        //System.out.println(p.TestPrivate);
        System.out.println(p.TestDefault);
        System.out.println(p.TestProtected);
    }
}
