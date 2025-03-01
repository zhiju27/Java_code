/**
 * 一个学生类
 */
public class SxtStu {
    int id;
    int age = 18;
    String sName;

    public void study(){
        System.out.println("正在学习，勿扰！");
    }
    public void kickball(){
        System.out.println("踢球中！");
    } //study()和kickball()都放在方法去中

    public static void main(String[] args) {
        SxtStu s1 = new SxtStu();// 对象放在堆中 把堆中的地址赋值给s1
        s1.id = 202;
        s1.sName = "yyy";
        s1.age = 23;
        System.out.println(s1.sName);
        System.out.println(s1.id);
        System.out.println(s1.age);
        s1.study();// 对象中的方法都是从方法区的代码中调用
        s1.kickball();
    }// 在栈中开辟一个栈帧空间 一个方法一个栈帧
}// 全放在方法区
