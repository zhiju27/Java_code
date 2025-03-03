package com.it.abstractClass;
/**
 * 测试抽象类
 */
public abstract class Animal {
    int age;
    public abstract void rest();
    public abstract void run();

    public void shout(){
        System.out.println("Animal.shout");
    }
}
class Dog extends Animal{

    @Override
    public void rest() {
        System.out.println("Dog.rest");
    }

    @Override
    public void run() {
        System.out.println("Dog.run");
    }
}

class Cat extends Animal{

    @Override
    public void rest() {
        System.out.println("Cat.rest");
    }

    @Override
    public void run() {
        System.out.println("Cat.run");
    }
}