package Patika;

import java.util.Scanner;

public class ManavKasaProgram {
	/*Manav Kasa Programı
	Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

	Meyveler ve KG Fiyatları

	Armut : 2,14 TL
	Elma : 3,67 TL
	Domates : 1,11 TL
	Muz: 0,95 TL
	Patlıcan : 5,00 TL
	Örnek Çıktı;

	Armut Kaç Kilo ? :0
	Elma Kaç Kilo ? :1
	Domates Kaç Kilo ? :1
	Muz Kaç Kilo ? :2
	Patlıcan Kaç Kilo ? :3
	Toplam Tutar : 21.68 TL
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        double armutkg, elmakg, domateskg, muzkg, patlicankg;
        double armutfiyat, elmafiyat, domatesfiyat, muzfiyat, patlicanfiyat;

        System.out.println("Armut kaç kilo");
        armutkg = scan.nextDouble();
        armutfiyat=armut * armutkg;

        System.out.println("Elma kaç kilo");
        elmakg = scan.nextDouble();
        elmafiyat = elma * elmakg;

        System.out.println("Domates kaç kilo");
        domateskg = scan.nextDouble();
        domatesfiyat=domates*domateskg;

        System.out.println("muz kaç kilo");
        muzkg=scan.nextDouble();
        muzfiyat=muz*muzkg;

        System.out.println("patlican kaç kilo");
        patlicankg=scan.nextDouble();
        patlicanfiyat=patlican*patlicankg;

        double total = armutfiyat+elmafiyat+muzfiyat+domatesfiyat+patlicanfiyat;

        System.out.println("Toplam tutar : " + total);
	}
}