package petle;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        int a;
        int suma = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            System.out.println("Podaj liczbe: ");
            a = scanner.nextInt();
             suma =+ a;
        }
        System.out.println("suma: " + suma);
    }
}
