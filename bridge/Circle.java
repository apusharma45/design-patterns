package bridge;

class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }
    void draw() {
        System.out.println("Circle with color " + color.applyColor());
    }
}
