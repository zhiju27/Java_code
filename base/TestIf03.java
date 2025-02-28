package base;
/**
 * if-elseif-else 多分支语句
 */
public class TestIf03 {
    public static void main(String[] args) {
        int i = (int)(Math.random() * 6 + 1);
        int j = (int)(Math.random() * 6 + 1);
        int k = (int)(Math.random() * 6 + 1);

        System.out.println("第一次掷骰子: " + i);
        System.out.println("第二次掷骰子: " + j);
        System.out.println("第三次掷骰子: " + k);

        int sum = i + k + j;

        if (sum > 15){
            System.out.println("手气不错");
        }else if (sum >= 10){
            System.out.println("手气一般");
        }else {
            System.out.println("不怎么样，回家吧孩子");
        }

        System.out.println("今天得分: " + sum);
    }
}