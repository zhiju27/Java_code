package base;
/**
 * switch多分支结构(多值结构)
 */
public  class TestSwitch {
    public static void main(String[] args) {
        // switch中表达式的值可以是int, byte, short, char, 枚举, 字符串, 但是不能是long
        int grade = (int) (Math.random() * 4) + 1;
        switch (grade){
            case 1:
                System.out.println("大一! ");
                break;
            case 2:
                System.out.println("大二! ");
                break;
            case 3:
                System.out.println("大三! ");
                break;
            default:
                System.out.println("大四! ");
        }
    }
}