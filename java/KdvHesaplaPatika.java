package Java_Ornekler;

import java.util.Scanner;

public class KdvHesaplaPatika {
	/*
	 KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve
KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)
KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8;
Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , 
tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	double kdvli=0.18;
	double kdvsiz=0.8;
	 
	System.out.print("Satılan Ürünün Fiyatını Giriniz :");
	Scanner scan=new Scanner(System.in);
	double sayi=scan.nextInt();
	
	if(sayi>0 & sayi<1000) {
		System.out.println("***KDV %18 olarak alınmıştır.***\n-->Ödenecek Tutar :"+((sayi*kdvli)+sayi));
	}else if(sayi>=1000) {
		System.out.println("***KDV %8 olarak alınmıştır.***\n-->Ödenecek Tutar :"+((sayi*kdvsiz)+sayi));
	}else {
		System.out.println("Yanlış bir değer girdiniz...");
	}
		
	}

}
