package base;

public class testConstant{
    // 在Java语言中用关键字final定义一个常量，常量初始化后不能再被更改
    public static void main(String[] args){
        final double PI = 3.14;
        //PI = 3.1415;// 无法赋值
        final int MAX_SPEED = 120;// 常量的定义全用大写字母 单词之间下划线隔开
        
        int r = 4;
        double area = PI * r * r;
        double circle = 2 * PI * r;
        System.out.println("面积是: " + area);
        System.out.println("周长是: " + circle);
    }
}