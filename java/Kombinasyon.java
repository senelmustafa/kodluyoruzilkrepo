package Patika;

import java.util.Scanner;

public class Kombinasyon {

	public static void main(String[] args) {
		// Kombinasyon hesaplıyoruz..:.Mustafa ŞENEL.::..
	/*	
		N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı
		farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
		N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

		Java ile kombinasyon hesaplayan program yazınız.

		Kombinasyon formülü
		C(n,r) = n! / (r! * (n-r)!)
*/
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int r=scan.nextInt();
		int ndepo=1;
		int rdepo=1;
		int nrdepo=1;
		for (int i = 1; i <=n; i++) {
				ndepo=ndepo*i;
		}
			for (int j = 1; j <=r; j++) {
				rdepo=rdepo*j;
			
			}
			for (int j = 1; j <=(n-r); j++) {
				nrdepo=nrdepo*j;
			
			}
		
			System.out.println("C(n,r) = "+ndepo/(rdepo*(nrdepo)));
			
		}
	}
 
