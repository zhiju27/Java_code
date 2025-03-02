/**
 * 测试static
 */

public class TestStatic {
    int id;
    String name;
    static String company = "北京尚学堂";

    public TestStatic(int id, String name){
        this.id = id;
        this.name = name;
    }// 构造器
    public void login(){
        System.out.println(name);
    }
    public static void printCompany(){
        //login();// 调用非静态成员，编译就会报错
        System.out.println(company);
    }

    public static void main(String[] args) {
        TestStatic usr = new TestStatic(1001, "yyy");
        TestStatic.printCompany();
        TestStatic.company = "北京阿里";
        TestStatic.printCompany();
    }
}
