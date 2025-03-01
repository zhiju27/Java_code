import java.util.Scanner;

/**
 * 定义一个“点”类用来表示二维空间中的点(有两个坐标)。要求如下：
 * 可以生成具有特定坐标的点对象
 * 可以设置坐标的方法
 * 提供哭可以计算该点距离另外一点距离的方法*/

public class Point {
    double x, y;

    // 构造器
    Point(double _x, double _y){
        x = _x;
        y = _y;
    }

    public double getDistance(Point p){
        return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
    }

    public static void main(String[] args) {
        Point p1 = new Point(3.0, 4.0);
        Point origin = new Point(0.0, 0.0);
        System.out.println(p1.getDistance(origin));
    }

}
