package iff;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz wyniki 3 testow");
        System.out.println("wynik 1.: ");
        int w1 = scanner.nextInt();
        System.out.print("wynik  2: ");
        int w2 = scanner.nextInt();
        System.out.print("wynk 3.: ");
        int w3 = scanner.nextInt();

        double srednia = (w1 + w2 + w3) / 3.0;

        int ocena;
        if (srednia >= 90 && srednia <= 100) {
            ocena = 5;
        } else if (srednia >= 80 && srednia < 90) {
            ocena = 4;
        } else if (srednia >= 70 && srednia < 80) {
            ocena = 3;
        }else if (srednia >=60 && srednia < 70){
            ocena = 2;
        }else if(srednia<60){
            ocena=1;
        }
        System.out.println("Średnia: " + srednia);
        System.out.println("Ocena: ' + ocena");
    }
}