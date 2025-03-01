/**
 * 静态初始化块
 */
public class TestStatic2 {
    static  String company;
    static {
        System.out.println("执行类的初始化工作");
        company = "后端开发岗";
        printCompany();
    }
    public static void printCompany() {
        System.out.println(company);
    }

    public static void main(String[] args) {
        // 静态初始化块执行顺序, 回溯到Object的静态初始化块，再向下执行子类的静态初始化块，直到类的静态初始化块为止
        // 构造方法执行顺序和上面顺序一样
        // 局部变量属于方法、成员变量属于对象、静态变量属于类
    }
}