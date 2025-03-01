package base;
/**
 * while型循环结构
 * @author yyy
 */
public class TestWhile {
    public static void main(String[] args) {
        /*int a = 0;
        while (a < 3){
            System.out.println("I love you! ---" + a);
            a++;
        }*/

        int i = 0;
        int sum = 0;
        while (i <= 100){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}