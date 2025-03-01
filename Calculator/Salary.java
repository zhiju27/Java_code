package Calculator;

import java.util.Scanner;

/**
 * 通过键盘输入用户月薪和每年是几个月薪水
 * 输出用户年薪
 * 输出一行字"如果年薪超过十万，恭喜你超过90%的国人"，"如果年薪超过20万，恭喜你超过98%的国人
 * 直到键盘输入88，则退出程序(使用break退出循环)"
 * 键盘输入66，则这个用户退出计算不显示"恭喜..."，直接显示"重新开始计算..."，然后算下一个用户的年薪*/
public class Salary {
    public static void main(String[] args) {
        while (true){
            Scanner s = new Scanner(System.in);
            //System.out.println("1.输入88退出程序\n2.输入66，计算下一个年薪");
            System.out.println("请输入月薪: ");
            double monthSalary = s.nextInt();
            if (monthSalary == 66){
                System.out.println("重新开始计算...");
                continue;
            } else if (monthSalary == 88) {
                System.out.println("系统退出! ");
                break;
            }else {
                System.out.println("请输入发薪月数: ");
                int month = s.nextInt();
                double yearSalary = monthSalary * month;
                System.out.println("您的年薪为: " + yearSalary / 10000 + "w");
                if (yearSalary > 200000){
                    System.out.println("恭喜您超过98%的国人! ");
                } else if (yearSalary > 100000) {
                    System.out.println("恭喜您超过90%的国人! ");
                }
            }


        }
    }
}