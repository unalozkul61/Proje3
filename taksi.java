package main;

import java.util.Scanner;

public class taksi {
    public static void main(String[] args) {
        int km;
        double total , perKm=2.20, startPrice = 10 ;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi Km olarak giriniz : ");
        km = input.nextInt();
        total = perKm * km;
        total += startPrice;

        total = (total <20) ? 20 :  total;
        System.out.println("Toplam Tutar : " + total);



    }
}
