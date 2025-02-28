package base;

// && 短路与 & 与 一个false则false
// || 短路或 | 或 一个true则true
// ！ 非 取反
// ^ 异或 相同false 不同true
public class TestLogicalOperators{
    public static void main(String[] args){
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 && b2);// false
        System.out.println(b1 || b2);// true
        System.out.println(!b2);// true
        System.out.println(b1 ^ b2);// true
    }
}