package base;
/**
 * 测试方法的重载
 */
public class TestOverload {
    public static void main(String[] args) {
        // 重载的方法实际是完全不同的方法，只是名称相同而已，形式参数列表不同
        // 形式参数列表不同指的是: 形参类型、形参个数、形参顺序不同
        // 只有返回值不同不构成重载
        // 只有形参名字不同不构成重载

    }
    static void add(int a, int b){

    }
    static void add(int a){

    }
    static void add(int a ,double b){

    }
    static void add(double a, int b){

    }
}