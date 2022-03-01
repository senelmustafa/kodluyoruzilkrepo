package Patika;

import java.util.Scanner;

public class HarmonikSeriFormulu {

	public static void main(String[] args) {
		// Harmonik Seri Formülü :
		//::..Mustafa ŞENEL..::
		
		System.out.println(" Bir Değer  Giriniz :");
		Scanner scan=new Scanner(System.in);
		int sayi=scan.nextInt();
		double deger=0;
		for(double i=1; i<=sayi ; i++) {
			deger+=(1/i);
		}
		System.out.println(deger);
	}

}
