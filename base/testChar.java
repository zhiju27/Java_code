package base;

// char类型用来表示Java中Unicode编码表中的字符
public class testChar{
    public static void main(String[] args){
        char c1 = 'a';
        char c2 = '中';
        char c3 = '\u0061';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // java中字符串不是基本数据类型，而是一个类
        String str = "中国";
        System.out.println(str);

        // 转义字符
        char c4 = '\n';
        System.out.println("a\n\'b\'\nc");
    }
}