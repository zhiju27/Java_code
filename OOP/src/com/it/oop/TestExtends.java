package com.it.oop;
/**
 * 测试继承
 */
public class TestExtends {
    public static void main(String[] args) {
        Student s1 = new Student("uuu", 172, "Java");
        // instanceof是用来判断一个对象是否属于这个类
        System.out.println(s1 instanceof Student);
        System.out.println(s1 instanceof Person);
        System.out.println(s1 instanceof Object);
    }
}

class Person /*extends Object*/{ //如果后面没写extends...那么就默认继承自Object
    int height;
    String name;
    public void rest(){
        System.out.println("休息");
    }
}

class Student extends Person{ // Person的属性Student都具备
    //int height;
    //String name;
    String major;
//    public void rest(){
//        System.out.println("休息");
//    }
    public void study(){
        System.out.println("学习");
        rest();
        System.out.println(this.name);
    }

    public Student(String name, int height, String major){
        this.name = name;
        this.height = height;
        this.major = major;
    }
}