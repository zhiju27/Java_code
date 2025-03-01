/**
 * 理解内存模型*/

public class Person {
    String name;
    int age;
    public void show(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "zhangsan";
        p1.age = 23;
        p1.show();

        Person p2 = new Person();
        p2.name = "yyy";
        p2.age = 23;
        p2.show();

    }
}
