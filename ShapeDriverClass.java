package pewarisan;

import java.util.Scanner;

public class ShapeDriverClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih salah satu: ");
        System.out.println("1. Rectangle \t2. Circle \t3. Cube");
        String pilihan = input.nextLine();
        System.out.println("Type the color u want: ");
        String color = input.nextLine();

        if(pilihan.equals("1")){
            System.out.println("Masukkan length: ");
            int length = input.nextInt();
            System.out.println("Masukkan width: ");
            int width = input.nextInt();
            Rectangle rectangle = new Rectangle("Rectangle", color, length, width);
            rectangle.print();
            rectangle.calculate();
        }else if(pilihan.equals("2")){
            System.out.println("Masukkan Radius: ");
            int radius = input.nextInt();
            Circle circle = new Circle("Circle", color, radius);
            circle.print();
            circle.calculate();
        }else if(pilihan.equals("3")) {
            System.out.println("Masukkan length: ");
            int length = input.nextInt();
            System.out.println("Masukkan width: ");
            int width = input.nextInt();
            System.out.println("Masukkan Height: ");
            int height = input.nextInt();
            Cube cube = new Cube("Cube", color, length, width, height);
            cube.print();
            cube.calculate();
        }

    }
}
