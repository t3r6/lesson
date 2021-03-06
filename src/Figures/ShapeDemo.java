package Figures;

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle("yellow", 5, 5, 5);
        Rectangle rectangle = new Rectangle("green", 6, 8);
        System.out.println(circle);
        System.out.println(rectangle);
        Shape[] figures = {circle, rectangle};
        for (Shape a : figures) {
            a.draw();
        }
    }
}