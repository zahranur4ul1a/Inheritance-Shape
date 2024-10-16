package pewarisan;

public class Shape {
    private String name;
    private String color;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape() {
        name = "";
        color = "";
    }

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void print() {
        System.out.println("Nama: \t" + name);
        System.out.println("Color: \t" + color);
    }
}
