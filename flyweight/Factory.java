package flyweight;

import java.util.HashMap;
import java.util.Map;

class Factory {
    private static final Map<String, Shape> map = new HashMap<>();
    public static Shape getCircle(String color) {
        Circle circle = (Circle) map.get(color);
        if(circle == null) {
            System.out.println("Creating new circle with color: " + color);
            circle = new Circle(color);
            map.put(color,circle);
            return circle;
        }
        else {
            System.out.println("returning existing circle with color: " + color);
            return circle;
        }
    }
}
