package petle;
//zad5
import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("podaj lancuch znakow: ");
        String lancuch = scanner.nextLine();

        System.out.print("podaj znak do zliczenia: ");
        char znak = scanner.next().charAt(0);

        int licznik = 0;
        for(int i = 0; i < lancuch.length();i++){
            if(lancuch.charAt(i) == znak){
                licznik++;
            }
        }
        System.out.printf("znak '%c' wystepuje %d razy w lancuchu.%n", znak,licznik);
    }
}
