package Patika;

import java.util.Scanner;

public class UsluSayilar {

	public static void main(String[] args) {
		// Üslü Sayılar Hesaplaması hesaplıyoruz.
		//Mustafa ŞENEL...
		Scanner scan = new Scanner(System.in);
		int depo=1;
		
		System.out.println("Bir Sayı Giriniz :");
		int number=scan.nextInt();
				
		System.out.println("Üslü değer giriniz");
		int exponent=scan.nextInt();
		
		for (int i=1; i<=exponent; i++) {
		depo*=number;
				
			}System.out.println(depo);
		}
	}

