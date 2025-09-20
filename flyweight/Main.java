package flyweight;

public class Main {
    public static void main(String[] args) {
        Shape redCircle = Factory.getCircle("Red");
        Shape greenCircle = Factory.getCircle("Green");
        Shape blueCircle = Factory.getCircle("Blue");
        Shape redCircleAgain = Factory.getCircle("Red");
        redCircle.draw();
    }
}
