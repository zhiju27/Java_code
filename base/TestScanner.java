package base;

import java.util.Scanner;

public class TestScanner{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入用户名: ");
        String uname = s.nextLine();
        System.out.println("请输入你的年龄: ");
        int age = s.nextInt();
        System.out.println("请输入你的月薪: ");
        double monthSalary = s.nextDouble();

        System.out.println(" ---- 年薪计算器 ---- ");
        System.out.println("用户名: " + uname);
        System.out.println("年龄: " + age);
        System.out.println("年薪: " + (monthSalary * 12));
    }
}