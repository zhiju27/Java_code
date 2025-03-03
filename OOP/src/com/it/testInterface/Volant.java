package com.it.testInterface;

// 飞行接口
public interface Volant {

    /*public static final*/ int Fly_Height = 100;
    /*public abstract*/ void fly();
}

// 善良接口
interface Honest{
    void helpOther();
}

class Plane implements Volant{
    /*Plane plane = new Plane();*/
    @Override
    public void fly() {
        System.out.println("在" + Plane.Fly_Height + "m的高度飞行");
    }
}

class Angel implements Volant, Honest{

    @Override
    public void helpOther() {
        System.out.println("Angel.helpOther");
    }

    @Override
    public void fly() {
        System.out.println("Angel.fly");
    }
}