package Figures;

public class Rectangle extends Shape{
    private int x, y;

    public Rectangle(String color, int x, int y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void draw(){
        System.out.println("Рисую прямоугольник "+ getColor() + " цвета");
    }
}
