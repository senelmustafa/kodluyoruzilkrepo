package Patika;

import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {
		//MukemmelSayi
		//::..Mustafa ŞENEL..::
		
		System.out.println("Lütfen bir sayı giriniz");
		Scanner scan=new Scanner(System.in);
		int sayi=scan.nextInt();
		int depo=0;
		for (int i = 1; i < sayi; i++) {
			if(sayi%i==0) {
				depo+=i;
				
			}
			
		}if (sayi==depo) {
			System.out.println(sayi+" mükemmel sayı");
			
		}else {
			System.out.println(sayi+" mükemmel sayı değildir");
		}

	}

}
