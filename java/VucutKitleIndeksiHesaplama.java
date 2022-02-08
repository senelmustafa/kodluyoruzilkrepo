package Java_Ornekler;

import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
/*
 Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
Formül->Kilo (kg) / Boy(m) * Boy(m)
Çıktısı
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173
 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double kkg;
		double kboy;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
		kboy=scan.nextDouble();
		
		System.out.print("Lütfen kilonuzu giriniz :");
		kkg=scan.nextDouble();
		
		System.out.println("Vücut Kitle İndeksiniz :"+(kkg/(kboy*kboy)));

	}

}
