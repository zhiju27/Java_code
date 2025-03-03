package com.it.encapsulation.b;

import com.it.encapsulation.a.Person;

public class Boy extends Person{
    public void play(){
        System.out.println(super.TestProtected);
        System.out.println(super.TestPublic);
        Person p = new Person();
        System.out.println(p.TestPublic);
        //System.out.println(p.TestProtected);
    }
}
// 1. 若父类和子类在同一个包中，子类可以访问父类的protected成员，也可访问父类对象的protected成员。
// 2. 若子类和父类不在同一个包中，子类可以访问父类的protected成员，不能访问父类对象的protected成员。