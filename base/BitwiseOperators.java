package base;

// 测试位运算符
public class BitwiseOperators{
    public static void main(String[] args){
        int a = 7;// 0111
        int b = 8;// 1000
        System.out.println(a & b);// 按位与 0000
        System.out.println(a | b);// 按位或 1111
        System.out.println(a ^ b);// 按位异或 1111
        System.out.println(~b);// 取反 -9

        int c = 5 << 1;//5*2
        System.out.println(c);
    }
}