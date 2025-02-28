package base;

// C语言可以使用0代表False，非0代表True;但是Java里面不可以，Java里只能用true和false
public class TestBool{
    public static void main(String[] args){
        boolean b1 = true;
        boolean b2 = false;

        if(b1){
            System.out.println("b1是true!\n");
        }else{
            System.out.println("b1是false!\n");
        }
    }
}