package base;

public class testVariable{
    //int a = 100;// 成员变量(属于对象)
    //static int b = 4;// 静态变量(属于类)     
    public static void main(String[] args){
        int age = 18;// 局部变量
        int b;
        System.out.println(age);
        b = 0;// 变量使用前必须初始化
        System.out.println(b);
    } 
}