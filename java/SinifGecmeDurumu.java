package Java_Ornekler;

import java.util.Scanner;

public class SinifGecmeDurumu {
/*
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
Geçme Notu : 55
Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise
ortalamaya katılmasın.
 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int mat,fiz,trk,kmy,mzk;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Matematik Notu Giriniz :");
		mat=scan.nextInt();
		
		System.out.println("Fizik Notu Giriniz :");
		fiz=scan.nextInt();
		
		System.out.println("Türkçe Notu Giriniz :");
		trk=scan.nextInt();
		
		System.out.println("Kimya Notu Giriniz :");
		kmy=scan.nextInt();
		
		System.out.println("Müzik Notu Giriniz :");
		mzk=scan.nextInt();
		
		if ((mat<0 ||mat>100)||(fiz<0 || fiz>100)||(trk<0 || trk>100) || (kmy<0 || kmy>100 )||(mzk<0 || mzk>100)){
			System.out.println("merhaba");
		}else {
			System.out.println("Ortalamanız"+(mat+fiz+trk+kmy+mzk)/5);
		}
	}

}
