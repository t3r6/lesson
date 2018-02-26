package Figures;

public class Circle extends Shape {
    private int R;
    private int x;
    private int y;

    public Circle(String color, int r, int x, int y) {
        super(color);
        R = r;
        this.x = x;
        this.y = y;
    }

    public int getR() {
        return R;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setR(int r) {
        R = r;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void draw(){
        System.out.println("Рисую круг "+ getColor() + " цвета");
    }
}
