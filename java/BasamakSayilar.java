package Patika;

import java.util.Scanner;

public class BasamakSayilariTopla {

	public static void main(String[] args) {
		//Basamak Sayılarını Toplayan Programming
		//:..Mustafa ŞENEL..:
		
		int sayi, toplam=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = scanner.nextInt();
        while(sayi!=0){
            int rakamlar=sayi % 10;
            toplam += rakamlar;
            sayi /=10;
        }
        System.out.println(toplam);
    }
}