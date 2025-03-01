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
        // Java本质上是值传递，但是如果传递的值是地址的话，那么这个值的属性被修改，则原地址的属性也会被修改

        Person p3 = p1;
        Person p4 = p1;
        p3.age = 80;
        System.out.println("p1.age:" + p1.age + "\tp3.age: " + p3.age + "\tp4.age:" + p4.age);
    }
}
