package base;
/**
 * 测试continue语句 执行下一次循环
 */
public class TestContinue {
    public static void main(String[] args) {
        int count = 0;
        /*for (int i = 100;i < 150;i++){
            if (i % 3 != 0){
                count ++;
                System.out.print(i + "\t");
            }
            if (count == 5){
                System.out.println();
                count = 0;
            }
        }*/
        for (int i = 100;i < 150;++i){
            if (i % 3 == 0){
                continue;
            }
            System.out.print(i + "\t");
            count++;
            if (count == 5){
                System.out.println();
                count = 0;
            }
        }
    }
}