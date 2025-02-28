package base;

public class testInt{
    public static void main(String[] args){
        int a = 100;
        int b = 015;
        int c = 0xff;
        int d = 0b1001010101;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        long salary = 3000000000L;// int中使用L或者l把整型常量定义为long类型 在23.01版本不适用 直接使用long然后再用L
        System.out.println("你的年薪: " + salary);
    }
}