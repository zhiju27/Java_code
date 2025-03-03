package com.it.encapsulation.b;

public class User {
    private int id;
    private String usr;
    private boolean man;

    public User(int id, String usr, boolean man){
        this.id = id;
        this.usr = usr;
        this.man = man;
    }

    public void printUserInfo(){
        System.out.println(id);
        System.out.println(usr);
        System.out.println(man);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public boolean isMan() {
        return man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }
}
