package Patika;

import java.util.Scanner;

public class UcakBiletiHesaplama {

	
	    @SuppressWarnings("resource")
		public static void main(String[] args) {
	        double km=0.1;
	        Scanner scan= new Scanner(System.in);
	        System.out.println("--------Uçak Bileti Hesaplayan Program--------");

	        System.out.print("Mesafeyi Km cinsinden giriniz : ");
	        int mesafe=scan.nextInt();
	        if(mesafe<=0){
	            System.out.println("Hatalı Veri Girdiniz!");
	            System.exit(0);
	        }

	        System.out.print("Yaşınızı giriniz : ");
	        int yas=scan.nextInt();
	        if(yas<=0){
	            System.out.println("Hatalı Veri Girdiniz!");
	            System.exit(0);
	        }
	        System.out.print("Yolculuğunuz tek yön ise  1, gidiş dönüş ise 2 yazınız : ");
	        int yolculukTipi=scan.nextInt();

	        double tutar=mesafe*km;

	        if(yas<12)
	            tutar/=2;
	        if(yas>=12 && yas <24)
	            tutar-=tutar*0.1;
	        if(yas>65)
	            tutar-=tutar*0.3;

	        if(yolculukTipi==2) {
	            tutar *= 2;
	            tutar -= tutar * 0.2;
	        }

	        System.out.println("Toplam Tutar : "+tutar);
	    }
	}