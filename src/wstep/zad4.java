package wstep;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        double kml;
        double km;
        double l;
    Scanner a = new Scanner(System.in);
        System.out.println("podaj km: ");
        km = a.nextDouble();
        System.out.println("podaj l: ");
        l = a.nextDouble();
    kml = km/l;
    System.out.println("na litrze paliwa przejechales: " + kml);
    }
}
