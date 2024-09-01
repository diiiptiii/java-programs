import Geometry.Circle;

public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
}
}