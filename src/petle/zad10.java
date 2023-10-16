package petle;

import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int populacja;
        while(true){
            System.out.print("wieksza niz 1: ");
            populacja = scanner.nextInt();
            if (populacja >=2){
                break;
            }else{System.out.println("musi byc wieksza niz 1");}
        }
        double dziennywzrost;
        while(true){
            System.out.println("podaj sredni dzienny przyrost populacji; ");
            dziennywzrost = scanner.nextDouble();
            if(dziennywzrost>0){
                break;
            }else{
                System.out.println("sredni dzienny przyrost musi byc wiekszy niz 0");
            }
        }
        int rozmnazanie;
        while(true) {
            System.out.println("podaj liczbe rozmnazazania: ");
            rozmnazanie = scanner.nextInt();
        }
    }
}

