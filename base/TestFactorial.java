package base;
/**
 * 递归解决阶乘
 */
public class TestFactorial {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();//当前时刻
        long res = Factorial(15);
        long endTime = System.currentTimeMillis();
        System.out.println(res);
        System.out.println("耗时: " + (endTime - startTime) + "ms");
    }
    public static int Factorial(int n){
        if (n == 1) {
            return 1;
        }else {
            return n * Factorial(n - 1);
        }
    }
}