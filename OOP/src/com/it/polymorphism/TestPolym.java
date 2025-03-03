package com.it.polymorphism;
/**
 * 测试多抬
 */
public class TestPolym {
    public static void main(String[] args) {
        animalCry(new Dog());
        animalCry(new Cat());
        //编译类型Animal    运行时类型Dog
        Animal animal = new Dog();// 向上转型（自动）
        animal.shout();
        Dog d = (Dog) animal; // 向下转型（强制）
        //animal.seeDoor();
        d.seeDoor();

        /*Cat c = (Cat)animal;
        c.sleep();// 编译不会报错，但是运行时报错，Dog不能强制转型为Cat*/
        if (animal instanceof Cat){
            Cat c = (Cat) animal;
            c.sleep();
        }
    }
    static void animalCry(Animal a){ // Animal a = new Dog() 父类引用指向子类对象
        System.out.println("TestPolym.animalCry");
        a.shout();
    }
}
