package no1;

import java.util.Scanner;

public class Tes {
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Meminta pengguna memasukkan tiga sisi segitiga
        System.out.print("Masukkan sisi1: ");
        double sisi1 = userInput.nextDouble();
        System.out.print("Masukkan sisi2: ");
        double sisi2 = userInput.nextDouble();
        System.out.print("Masukkan sisi3: ");
        double sisi3 = userInput.nextDouble();

        // Meminta pengguna memasukkan warna
        System.out.print("Masukkan warna: ");
        String color = userInput.next();

        // Meminta pengguna memasukkan apakah segitiga terisi (true/false)
        System.out.print("Apakah segitiga terisi (true/false)? ");
        boolean filled = userInput.nextBoolean();

        // Membuat objek segitiga dengan nilai-nilai yang dimasukkan
        Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3, color, filled);

        System.out.println("Sebuah " + segitiga.toString());
        System.out.println("Luas segitiga       : " + segitiga.getArea());
        System.out.println("Keliling segitiga   : " + segitiga.getPerimeter());
        System.out.println("Warna segitiga      : " + segitiga.getColor());
        System.out.println("Apakah segitiga terisi? " + segitiga.isFilled());
    }
}
