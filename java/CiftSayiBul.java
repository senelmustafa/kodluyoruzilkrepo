package Patika;

import java.util.Scanner;

public class CiftSayiBul {
/*
 *Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 
 *3 ve 4'e tam bölünen sayıların ortalamasını
 * hesaplayan programı yazınız.
 */
	public static void main(String[] args) {
		System.out.println("Bir Sayı Giriniz :");
		Scanner scan =new Scanner(System.in);
		int sayi=scan.nextInt();
		int sayac=0;
		int depo=0;
		for (int i = 0; i < sayi; i++) {
			if(i%3==0 && i%4==0) {
				depo+=i;
				 sayac++; 
				
			}
			
		}System.out.println("Ortalama "+depo/sayac);
	}

}
