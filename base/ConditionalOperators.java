package base;

// 条件运算符
public class ConditionalOperators{
    public static void main(String[] args){
        //x ? y : z
        //x为true返回y，x为false返回z
        int score = 90;
        String a = score < 60 ? "不及格" : "及格";
        System.out.println(a);
    }
}