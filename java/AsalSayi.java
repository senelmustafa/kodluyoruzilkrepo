package Patika;

import java.util.Scanner;

public class AsalSayi {

	public static void main(String[] args) {
//		
//		System.out.println("Bir Sayi Giriniz :");
//		Scanner scan=new Scanner(System.in);
//		int sayi=scan.nextInt();
		 
//			if(  sayi%3==0 || sayi%4==0 || sayi%5==0 || sayi%6==0 || sayi%7==0 || sayi%8==0 || sayi%9==0) {
//				System.out.println("asal Değildir");
//			}else {
//				System.out.println("Asal sayıdır.");
//			}
			
		for (int i = 1; i < 100; i++) {
			boolean asalMi=true;
			for(int j = 2; j < i; j++) {
				if(i%j==0) {
					asalMi=false;
					break;
				}
			}
			if(asalMi) {
				System.out.print(i+" ");
			}
			
		}
		}
	}
 
