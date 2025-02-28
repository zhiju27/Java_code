package base;

import java.util.Scanner;

/**
 * switch多分支结构
 */
public class TestSwitch03 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入电脑品牌: ");
        String computer = s.nextLine();
        switch (computer){
            case "联想":
                System.out.println("联想! ");
                break;
            case "华为":
                System.out.println("华为! ");
                break;
            case "苹果":
                System.out.println("苹果! ");
                break;
            default:
                System.out.println("未知! ");
        }
    }

}