package petle;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbe pieter w hotelu: ");
        int liczbaPieter = scanner.nextInt();

        while(liczbaPieter < 1){
            System.out.println("za mala liczba pieter");
            System.out.println("podaj liczbe pieter: ");
            liczbaPieter = scanner.nextInt();
        }
        int sumaPokoi = 0;
        int sumaZajetychPokoi = 0;

        for(int pietro = 1;pietro <= liczbaPieter;pietro++){
            System.out.print("podaj liczbe zajetych pokoi na pietrze " + pietro + ": ");
            int liczbaZajetychPokoi = scanner.nextInt();
            while (liczbaZajetychPokoi < 0 || liczbaZajetychPokoi > 10){
                System.out.println("max 10 pokoi");
                System.out.print("podaj liczbe zajetych pokoi na pietrze " + pietro +": ");
                liczbaZajetychPokoi = scanner.nextInt();
            }
            int LiczbaPokoiNaPietrze = 10;
            sumaPokoi += LiczbaPokoiNaPietrze;
            sumaZajetychPokoi += liczbaZajetychPokoi;
        }
        int pustePokoje = sumaPokoi - sumaZajetychPokoi;
        double poziomOblozenia = (double) sumaZajetychPokoi / sumaPokoi;
        System.out.print("pokoje w hotelu: " + sumaPokoi);
        System.out.print(" zajete: " + sumaZajetychPokoi);
        System.out.print(" puste pokoje: " + pustePokoje);
        System.out.print(" poziom oblozenia: " + (poziomOblozenia * 100)+ "%");
    }
}
