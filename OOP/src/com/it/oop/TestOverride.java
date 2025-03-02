package com.it.oop;
/**
 * 测试方法重写Override
 */

public class TestOverride {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.getVehicle();
        h.run();

        Plane p = new Plane();
        p.getVehicle();
        p.run();
    }
}

class Vehicle{
    public void run(){
        System.out.println("跑...");
    }

    public Vehicle getVehicle(){
        System.out.println("获得一个交通工具");
        return null;
    }
}

class Horse extends Vehicle{
    @Override
    public void run() {
        System.out.println("得得得...");
    }

    @Override
    public Horse getVehicle() {// 返回类型是Horse小于父类Vehicle
        System.out.println("获得一匹马");
        return new Horse();
    }
}
class Plane extends Vehicle{
    @Override
    public void run() {
        System.out.println("呜呜呜...");
    }

    @Override
    public Plane getVehicle() { // 返回类型是Plane小于父类Vehicle
        System.out.println("获得一架飞机");
        return new Plane();
    }
}