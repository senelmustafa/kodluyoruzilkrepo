package Patika;

import java.util.Scanner;

public class HesapMakinasi {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		

		System.out.println("════İşlem Seçiniz════ :");
		System.out.println("1)Toplama\n2)Çıkartma\n3)Çarpma\n4)Bölme");
		int secim = scan.nextInt();
		
		
		System.out.print("Birinci Sayıyı Giriniz :");
		int a = scan.nextInt();

		System.out.print("İkinci Sayıyı Giriniz :");
		int b = scan.nextInt();
		
		switch (secim) {
		case 1:
			System.out.print(a+b);
			break;
		case 2:
			System.out.print(a-b);
			break;
		case 3:
			System.out.print(a*b);
			break;
		case 4:
			System.out.print(a/b);
			break;

		default:
			System.out.print("yanlış bir işlem yaptınız tekrar deneyiniz");
			break;
		}
	}

}
