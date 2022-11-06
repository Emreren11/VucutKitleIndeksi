package vucutkitle;

import java.util.Scanner;

public class Vucutkitle {

    public static void main(String[] args) {
        
        double boy, kilo;
        
        Scanner input=new Scanner(System.in);
        
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy=input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo=input.nextDouble();
        System.out.println("Vucüt Kitle İndeksiniz: "+kilo/(boy*boy));
        
    }
    
}
