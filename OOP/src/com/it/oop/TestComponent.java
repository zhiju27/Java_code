package com.it.oop;
/**
 * 测试组合方法
 * 组合非常灵活，可以复用很多类的代码
 * 将其他类的对象作为当前类的属性，有点类似与C++的多继承
 * 对于 is -a关系建议使用继承，has -a关系建议使用组合
 * 例如 Student is a Person的逻辑没有问题，但是Student has a Person的逻辑就有问题
 * 这时候显然继承关系更合适
 * 而Computer 和 Chip 则是has -a的关系更合适
 */
public class TestComponent {
}
class Person2 /*extends Object*/{ //如果后面没写extends...那么就默认继承自Object
    int height;
    String name;
    public void rest(){
        System.out.println("休息");
    }
}

class Student2 /*extends Person*/{ // Person的属性Student都具备
    //int height;
    //String name;
    Person2 person2 = new Person2();
    String major;
    //    public void rest(){
//        System.out.println("休息");
//    }
    public void study(){
        System.out.println("学习");
        person2.rest();
        System.out.println(this.person2.name);
    }

    public Student2(String name, int height, String major){
        this.person2.name = name;
        this.person2.height = height;
        this.major = major;
    }
}