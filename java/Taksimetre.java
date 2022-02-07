package Java_Ornekler;

import java.util.Scanner;

public class Taksimetre {
	/*Taksimetre Programı
	Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

	Taksimetre KM başına 2.20 TL tutmaktadır.
	Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
	Taksimetre açılış ücreti 10 TL'dir.
	*/
	public static void main(String[] args) {
		double kmyol=2.20;
		double tutar=20;
		double acilis=10;
		double ode;
		System.out.print("Gidilen KM giriniz :");
		
		Scanner scan =new Scanner(System.in);
		double km=scan.nextDouble();
		
		ode=(kmyol*km)+acilis;
		
		System.out.println(ode<=20 ? "20TL" : ode);
		
		/*
		 * if(ode<=20) {
		
			System.out.println("Borcunuz 20 TL dir.");
		}else if(ode>20) {
			System.out.println("Borcunuz "+ode+" dır.");
		}else {
			System.out.println("yanlış bir değer girdiniz");
		}
		 */
		
		
	}

}
