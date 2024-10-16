package pewarisan;

public class Cube extends Rectangle {
    private int height;

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Cube() {
        super();
        height = 0;
    }

    public Cube(String name, String color, int length, int width, int height) {
        super(name, color, length, width);
        this.height = height;

    }
    public void calculate() {
        System.out.println("Area: " + (getLength() * getWidth() * height));
    }

    public void print() {
        System.out.println("Height: \t" + height);
    }

}
