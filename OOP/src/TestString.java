/**
 * 测试字符串
 */

public class TestString {
    public static void main(String[] args) {
        String s0 = null;// 空
        String s1 = ""; // 空字符串
        String s2 = "java";
        String s3 = new String("Java");
        //System.out.println(s0.length());// null没有长度
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s3.length());

        String g1 = "yyy";
        String g2 = "yyy";
        String g3 = new String("yyy");// g1 g2是相同的对象，g3是新的对象
        System.out.println(g1 == g3);// false
        System.out.println(g1 == g2);// true 比较是否为同一个对象
        System.out.println(g1.equals(g3));// true 比较字符串内容是否相同

    }
}
