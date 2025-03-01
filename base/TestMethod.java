package base;
/**
 * 测试方法的定义和调用
 */
public class TestMethod {
    public static void main(String[] args) {
        sayLoveU();
        int a = 8, b = 20, sum = 0;
        System.out.println(add(a, b, sum));
        int i = add(10,20,0);
        System.out.println(i);

    }

    public static  void sayLoveU(){
        System.out.println("I love you! ");
    }
    public  static  int add(int a, int b, int sum){
        sum = a + b;
        return sum;
    }
}