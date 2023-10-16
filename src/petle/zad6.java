package petle;

import java.util.Scanner;

//zad4
public class zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("oblicz liczba dni przepracowanych: ");
        int dniPracy = scanner.nextInt();
        if(dniPracy < 1){
            System.out.println("liczba dni musi byc wieksza lub rowna 1");
        }else{
            double zarobki = 0.01;
            System.out.println("Dzien\tZarobki");

            for(int dzien = 1;dzien<=dniPracy;dzien++){
                System.out.printf("%d\t%.2f zł%n", dzien,zarobki);
                zarobki *= 2;
            }
            double SumaZarobkow = zarobki/2;
            System.out.printf("sumaryczne zarobki: %.2f zł%n", SumaZarobkow);
        }
    }
}
