package com.it.oop;
/**
 * 测试Object类
 */
public class TestObject extends Object{
    void view(){
        System.out.println(/*"当前对象" + */this);
    }

    String usr;
    String pwd;
    @Override
    public String toString() {
        return "账户名：" + usr + "密码：" +pwd;
    }
    TestObject(){}

    public TestObject(String usr, String pwd) {
        this.usr = usr;
        this.pwd = pwd;
    }

    public static void main(String[] args) {
        TestObject to = new TestObject("yyy", "123456");
        //System.out.println("当前对象" + this);
        to.view();
        System.out.println(to.toString());
        System.out.println(to);// 默认调用.toString()方法
        System.out.println("TestObject.main");
        // soutm -> System.out.println("所在类.方法")
    }
}
