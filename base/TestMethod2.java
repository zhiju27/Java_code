package base;

import java.util.Scanner;

/**
 * 输入：迟到时间，月薪
 * 处理逻辑：
 * 迟到1-10分钟，警告
 * 迟到11-20分钟，罚款100元
 * 迟到21-30分钟，罚款200元
 * 迟到30分钟以上扣除半日工资
 * 迟到1个小时以上，按照旷工计算，扣除3日工资*/
public class TestMethod2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入迟到时间(min): ");
        int time = scanner.nextInt();
        System.out.println("请输入月薪(元): ");
        int salary = scanner.nextInt();
        int punishment = punish(time, salary);
        System.out.println("罚款金额: " + punishment + "元");
    }
    public static int punish(int time, int salary){
        int punishment = 0;
        if (time <= 10){
            System.out.println("警告一次, 下不为例! ");
        } else if (time <= 20) {
            punishment = 100;
        } else if (time <= 30) {
            punishment = 200;
        } else if (time <= 60) {
            punishment = salary / 60;
        } else {
            punishment = salary / 10;
        }
        return punishment;
    }
}