package bridge;

public class Main {
    public static void main(String[] args) {
        Color color = new RedColor();
        Shape circle = new Circle(color);
        circle.draw();
    }
}
