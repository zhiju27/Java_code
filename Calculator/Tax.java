package Calculator;

import java.util.Scanner;

/**
 * 通过键盘输入用户的月薪
 * 百度个税计算方式，计算出应缴纳的税款
 * 直到键盘输入88，则退出程序(使用break退出循环)*/
public  class Tax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ---- 个税计算器 ---- ");
        double tax = 0;
        while (true){
            System.out.println("请输入您的月薪: ");
            double monthSalary = scanner.nextDouble();
            double forTax = monthSalary - 5000;
            if (monthSalary == 88){
                System.out.println("系统退出! ");
                break;
            } else if (monthSalary <= 5000) {
                System.out.println("应缴纳税额为: " + tax);
            } else if (forTax <= 3000) {
                tax = forTax * 0.03 - 0;
                System.out.println("应缴纳税额为: " + tax);
            } else if (forTax <= 12000) {
                tax = forTax* 0.10 - 210;
                System.out.println("应缴纳税额为: " + tax);
            } else if (forTax <= 25000) {
                tax = forTax * 0.20 - 1410;
                System.out.println("应缴纳税额为: " + tax);
            }else if (forTax <= 35000) {
                tax = forTax * 0.25 - 2660;
                System.out.println("应缴纳税额为: " + tax);
            }else if (forTax <= 55000) {
                tax = forTax * 0.30 - 4410;
                System.out.println("应缴纳税额为: " + tax);
            }else if (forTax <= 80000) {
                tax = forTax * 0.35 - 7610;
                System.out.println("应缴纳税额为: " + tax);
            }else {
                tax = forTax * 0.45 - 15160;
                System.out.println("应缴纳税额为: " + tax);
            }
            monthSalary -= tax;
            System.out.println("应交税所得额: " + forTax + "实发工资: " + monthSalary);
        }
    }
}
