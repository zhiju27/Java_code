package com.it.oop;
/**
 * 关于继承树
 */
public class TestSuper02 {
    public static void main(String[] args) {
        new ChildClass();
    }
}
class FatherClass{
    static {
        System.out.println("静态初始化：FatherClass");
    }
    public FatherClass() {
        System.out.println("创建FatherClass");
    }
}
class ChildClass extends FatherClass{
    static {
        System.out.println("静态初始化：ChildClass");
    }
    public ChildClass(){
        super();//在一个类中，若是构造方法的第一行没有调用super(...)或者this(...);那么Java默认都会调用super()，含义是调用父类的无参数构造方法。
        System.out.println("创建ChildClass");
    }
}
