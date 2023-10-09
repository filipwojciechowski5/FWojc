package iff;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj mase : ");
        double masa = scanner.nextDouble();
        double ciezar = masa * 9.8;
        System.out.println("ciezar: " + ciezar);
        if(ciezar<10){
            System.out.println("ciezar jest za lekki");
        }else if(ciezar>1000){
            System.out.println("ciezar jest za ciezki");
        }
    }
}
