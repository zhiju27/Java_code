package com.it.oop;

import java.util.Objects;

/**
 * 测试equals方法
 */

public class TestEquals {
    int id;
    String usr;
    String pwd;

    TestEquals(int id, String usr, String pwd){
        this.id = id;
        this.usr = usr;
        this.pwd = pwd;
    }

    public static void main(String[] args) {
        TestEquals t1 = new TestEquals(1001, "yyy", "123456");
        TestEquals t2 = new TestEquals(1001, "yyy", "654321");
        /*System.out.println(t1);
        System.out.println(t2);
        System.out.println(t1.id + t1.usr + t1.pwd);
        System.out.println(t2.id + t2.usr + t2.pwd);*/
        System.out.println(t1.equals(t2));

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TestEquals that = (TestEquals) o;
        return id == that.id && Objects.equals(usr, that.usr) && Objects.equals(pwd, that.pwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, usr, pwd);
    }
}
