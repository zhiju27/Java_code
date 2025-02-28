package base;

// 浮点数 适合普通的科学和工程计算，精度足够;但不适合精度要求非常高的商业计算，这时候要使用BigDecimal进行运算和比较
public class testFloat{
    public static void main(String[] args){
        double d1 = 3.14;
        double d2 = 3.14E2;
        System.out.println(d2);
        float f1 = 1.65F;// 浮点型常量的默认类型是double，改float需要加F
        System.out.println(f1);

        // 浮点数是不精确的，尽量不要直接比较
        float f2 = 0.1F;
        double d3 = 1.0 / 10;
        System.out.println(f2 == d3);

        float f4 = 234324332432L;
        float f5 = f4 + 1;
        System.out.println(f4 == f5);
    }
}