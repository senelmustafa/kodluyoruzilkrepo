package Java_Ornekler;

import java.util.Scanner;

public class DikUcgenHipotenus {
/*
 Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
𝑢 = (a+b+c) / 2
Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Üçgenin dik kenarını giriniz a:");
		int a=scan.nextInt();
		
		System.out.print("Üçgenin yatay kenarını giriniz b:");
		int b=scan.nextInt();
		
		double c=Math.sqrt((a*a)+(b*b));
		System.out.println(c);//hipotenüsü bulduk
		
		//alan hesaplıyoruz
		double u=(a+b+c)/2;
		double alan=Math.sqrt(u * (u-a)* (u-b) * (u-c));
		
		System.out.println("Üçgenin Alanı:"+alan);
		
		
	}

}
