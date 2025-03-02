package com.it.test;

import com.it.oop.Car;
import java.util.*;
import static java.lang.Math.*;// 静态导入，其作用是导入指定类的静态属性和静态方法，这样就可以直接使用静态属性和静态方法
import static java.lang.Math.PI;
/**
 * 测试导入import
 */
public class TestImport {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        List list;
        System.out.println(PI);
        System.out.println(random());
    }
}
