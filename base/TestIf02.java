package base;

/**
 * if-else双分支结构
 */
public  class TestIf02 {
    public static void main(String[] args) {
        //final double PI = 3.14;
        double r = 4 * Math.random();
        double area = Math.PI * r * r;
        double circle = 2 * Math.PI *r;
        System.out.println("半径为: " + r);
        System.out.println("面积和周长分别为: " + area + ", " + circle);

        if (area > circle){
            System.out.println("面积的数值大于周长！");
        }else {
            System.out.println("面积的数值小于周长！");
        }
    }
}