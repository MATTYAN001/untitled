package textbooks_practice.chapter5;

public class Practice4 {
    public static void main(String[] args) {
        double bottom = 10.0, height = 5.0, radius = 5.0;
        System.out.println("底辺は" + bottom + "cm　高さは" + height
                + "cm　の時の三角形の面積は" + calcTriangleArea(bottom,height) + "平方cm");
        System.out.println("半径は" + radius + "cm の時の円の面積は" + calcCircleArea(radius) + "平方cm");
    }
    public static double calcTriangleArea(double bottom, double height){
        return (bottom*height)/2;
    }
    public static double calcCircleArea(double radius){
        return radius * radius * Math.PI;
    }
}
