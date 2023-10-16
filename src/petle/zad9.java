package petle;

import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczbat = scanner.nextInt();

        while(liczbat < 1){
            System.out.println("podaj ponownie: ");
            liczbat = scanner.nextInt();
        }
        double sumaopadow = 0;
        int sumamiesiecy = 0;

        for(int rok = 1; rok <=liczbat; rok++){
            for(int miesiac = 1;miesiac<-12;miesiac++){
                System.out.println("podaj opady w cm: " +miesiac + "roku" + rok + ": ");
                double opady = scanner.nextDouble();
                while(opady<0){
                    System.out.println("mie moze byc ujemna ");
                    opady = scanner.nextDouble();
                }
                sumaopadow += opady;
                sumamiesiecy++;
            }

        }
        double srednipoziomopadow = sumaopadow/sumamiesiecy;
        System.out.println("liczba miesiecy: " + sumamiesiecy);
        System.out.println("laczna ilosc opadow w cm: " + sumaopadow);
        System.out.println("sredni poziom opadow: " + srednipoziomopadow);
    }
}
