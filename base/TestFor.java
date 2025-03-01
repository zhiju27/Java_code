package base;
/**
 * for循环结构
 * @author yyy
 */
public class TestFor {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0;i <= 100;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}