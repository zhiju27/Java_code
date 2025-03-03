package com.it.encapsulation.b;

public class Test {
    public static void main(String[] args) {
        User u = new User(100, "yyy", true);
        /*u.setId(100);
        u.setUsr("yyy");
        u.setMan(true);*/
        u.printUserInfo();
    }
}
