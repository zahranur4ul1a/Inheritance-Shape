package toko;

import java.util.Scanner;

public class TesterInput {
    public static void main(String[] args) {
        product[] p = new product[5];
        Scanner in = new Scanner(System.in);

        System.out.println("pilih antara CD/DVD/Product?");
        String pilihan = in.nextLine();

        System.out.println("Name : ");
        String name = in.nextLine();
        System.out.println("Number : ");
        int number = in.nextInt();
        System.out.println("Quantity : ");
        int quantity = in.nextInt();
        System.out.println("Price : ");
        double price = in.nextDouble();
        p[3] = new product(number, name, quantity, price);
        p[3].print();
        if(pilihan.equals("CD")) {
            System.out.println("Artist : ");
            String artist = in.nextLine();
            System.out.println("Label : ");
            String label = in.nextLine();
            System.out.println("Total song : ");
            int numSong = in.nextInt();
            //CD c1 = new CD(number, name, quantity, price, artist, numSong, label);
            //c1.print();
            p[0] = new CD( number, name, quantity, price, artist, numSong, label);
            p[0].print();

        }else if(pilihan.equals("DVD")){
            System.out.println("Length : ");
            int length = in.nextInt();
            System.out.println("Rating : ");
            String rating = in.nextLine();
            System.out.println("Studio : ");
            String studio = in.nextLine();
            //DVD d1 = new DVD(number, name, quantity, price, length, rating, studio);
            //d1.print();
            p[1] = new DVD(number, name, quantity, price, length, rating, studio);
            p[1].print();


        }
        in.close();
    }
}
