package base;
/**
 * switch多分支结构
 */
public class TestSwitch02 {

    public static void main(String[] args) {
        int month = (int) (Math.random() * 12 + 1);
        switch (month){
            case 1, 2, 3:
                System.out.println(month + "月, 春季");
                break;
            case 4, 5, 6:
                System.out.println(month + "月, 夏季");
                break;
            case 7, 8 ,9:
                System.out.println(month + "月, 秋季");
                break;
            default:
                System.out.println(month + "月, 冬季");
        }
    }

}