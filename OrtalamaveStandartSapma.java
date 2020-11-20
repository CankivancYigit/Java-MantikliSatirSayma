//Cankivanc Yigit N17136358
package ortalamavestandartsapma;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class OrtalamaveStandartSapma {

    public static double OrtalamaHesapla(LinkedList<Double> sayilar, int n) {

        ListIterator<Double> iterator = sayilar.listIterator();
        double toplam = 0;
        while (iterator.hasNext()) {

            Double next = iterator.next();
            toplam += next;

        }

        return toplam / n;
       }

    public static double StandartSapmaHesapla(LinkedList<Double> sayilar, int n) {
       
        ListIterator<Double> iterator = sayilar.listIterator();
        
        double toplam = 0;
        
        while (iterator.hasNext()) {

            Double next = iterator.next();
            double deger = (next - OrtalamaHesapla(sayilar, n));
            toplam += ((deger*deger)/(n-1));
        }
        double StandartSapma = Math.sqrt(toplam);
        return StandartSapma;
    }

    public static void main(String[] args) {
        try {
            
       
        Scanner scanner = new Scanner(System.in);

        LinkedList<Double> sayilar = new LinkedList<Double>();

        int sayac = 0;
        System.out.print("Girmek istediginiz sayi adedi :");

        int n = scanner.nextInt();
        scanner.nextLine();

        while (sayac != n && n>=0 ) {
            System.out.print("Sayi giriniz :");
            double sayi = scanner.nextDouble();
            scanner.nextLine();
            sayilar.add(sayi);
            sayac++;

        }
        System.out.println(sayilar);
        System.out.printf("Sayilarin ortalamasi : %.2f\n" , OrtalamaHesapla(sayilar, n));
        System.out.printf("Sayilarin standart sapmasi : %.2f\n" , StandartSapmaHesapla(sayilar, n));
         
        } catch (Exception InputMismatchException) {
             
             System.out.println("Girmek istediginiz sayi adedinde ya da girdiginiz sayilarda hata var."
                     + "Girmek istediginiz sayi adedini yazarken tam sayi kullanin. Ondalik sayi yazarken virgül kullanin!  ");
            
             }
    }
}


























