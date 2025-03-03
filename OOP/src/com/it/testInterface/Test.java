package com.it.testInterface;

public class Test {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.fly();

        Angel angel = new Angel();
        angel.fly();
        angel.helpOther();
        System.out.println(Volant.Fly_Height);

        Volant angel1 = new Angel();
        angel1.fly();
        //angel1.helpOther();
        Angel angel2 = (Angel) angel1;
        angel2.helpOther();

        System.out.println(" ---- 测试默认方法 ----");
        TestDefault td = new TestDefault01();
        td.moren();
        td.printInfo();

        System.out.println(" ---- 测试静态方法 ---- ");
        TestDefault.testStatic01();
    }
}
