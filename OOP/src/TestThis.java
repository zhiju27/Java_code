/**
 * 测试this的使用
 */
public class TestThis {
    int a, b, c;

    TestThis(){
        System.out.println("正要初始化的对象：" + this);
    }
    TestThis(int a, int b){
        this();
        this.a = a;
        this.b = b;
    }

    public TestThis(int a, int b, int c) {
        this(a,b);
        this.c = c;
    }
    void sing(){
    }
    void eat(){
        System.out.println("当前对象：" + this);
        sing();
        System.out.println("你妈叫你回家吃饭！");
    }

    public static void main(String[] args) {
        TestThis hi = new TestThis(2,3,4);
        hi.eat();
    }
}
