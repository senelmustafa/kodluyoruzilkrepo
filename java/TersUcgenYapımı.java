package Patika;

import java.util.Scanner;

public class TersUcgenYapımı {

	public static void main(String[] args) {
		// Ters Üçgen Yapımı
		//::..Mustafa ŞENEL..::
		System.out.println("Basamak Sayısını Giriniz :");
		Scanner scan=new Scanner(System.in);
		int sayi=scan.nextInt();
		
		for (int i = 0; i < sayi; i++) {
			 
			for (int j = 0; j <= i; j++) {
				System.out.print( " ");
			}
			for(int k=2*sayi-1 ;k>=(2*i+1);k--) {
				System.out.print( "*");
			}
			 System.out.println();
		}

	}

}
