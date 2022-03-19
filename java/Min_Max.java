package Patika;

import java.util.Scanner;

public class Min_Max {

	public static void main(String[] args) {
		//  Girilen Sayılardan Min ve Max Değerleri Bulma
		System.out.println("Kaç tane sayı gireceksiniz :");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		 
 
		
int maks=0;
int min=0;


for (int i=1; i<=num; i++)
{
    System.out.println(i+". sayiyi giriniz: ");
    int sayi = scan.nextInt();
    
    if (i==1)
    {
        maks=sayi;
        min=sayi;
    }
    
    if (sayi>maks)
        maks=sayi;
    
    if (sayi<min)
        min=sayi;
}

System.out.println("girdiginiz 10 sayi icinden en buyuk olani: "+maks);
System.out.println("girdiginiz 10 sayi icinden en kucuk olani: "+min);
}

}