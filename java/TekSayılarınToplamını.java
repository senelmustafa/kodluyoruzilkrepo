package Patika;

import java.util.Scanner;

public class TekSayılarınToplamını {
/*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan 
   girişleri kabul eden ve girilen değerlerden 
   çift ve 4'ün katları olan sayıları
    toplayıp ekrana basan programı yazıyoruz.
  */
 
	public static void main(String[] args) {
		int n;
		int topla=0;
		Scanner scan=new Scanner(System.in);
		
	 
	 do {
		 System.out.println("bir sayı giriniz");
		 n=scan.nextInt();
		 if(n%2==0 || n%4==0) {
			 topla+=n;
			 
		 }
	} while (n%2==0);
	 System.out.println(" "+topla);

	}

}
