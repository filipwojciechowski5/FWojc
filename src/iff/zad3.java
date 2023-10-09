package iff;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj wage: ");
        int waga = scanner.nextInt();
        System.out.println("podaj wzrost: ");
        double wzrost = scanner.nextDouble();
        double BMI = wzrost*2;
        BMI = waga/wzrost;
        System.out.println("BMI: "+ BMI);
        if(BMI<18.5){
            System.out.println("niedowaga");
        }else if(BMI>=18.5 && BMI<=25){
            System.out.println("Odpowiedni wspolczynnik BMI");
        }else if(BMI>25){
            System.out.println("nadwaga");
        }
    }
}
