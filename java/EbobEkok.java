package Patika;

import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		System.out.println("Birinci sayıyı giriniz:"); 
		Scanner scan = new Scanner(System.in);
		 int n1=scan.nextInt();
		 System.out.println("İkinci sayıyı giriniz:"); 
		 int n2=scan.nextInt();
		 int ebob=1;
		
		 
		   int   ekok;
		   
	        ekok= (n1 > n2) ? n1 : n2;
	 
	        while(true)
	        {
	            if( ekok % n1 == 0 && ekok % n2 == 0 )
	            {
	                System.out.printf("%d ve %d sayılarının EKOK'u %d dir.", n1, n2, ekok);
	                break;
	            }
	            ++ekok;
	        }
	    } 
	}
	 
  
