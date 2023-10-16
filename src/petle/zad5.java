package petle;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj predkosc w km/h ");
        int predkosc = scanner.nextInt();

        System.out.println("Podaj czas");
        int czas = scanner.nextInt();

        if(predkosc <= 0 || czas < 1){
        System.out.println("niepoprawne dane");
        return;}

        int odleglosc = predkosc * czas;
        System.out.println("odleglosc: " + odleglosc);

        for(int i = 1;i <=czas;i++){
            System.out.println("odleglosc przejechana po " + i + "godzinie " + predkosc *i);
        }
    }
}
