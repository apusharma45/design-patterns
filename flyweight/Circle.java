package flyweight;

class Circle implements Shape{
    private String color;
    public Circle(String color) {
        this.color = color;
    }
    public void draw() {
        System.out.println(color + " circle");
    }
}
