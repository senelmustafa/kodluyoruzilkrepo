package Patika;

import java.util.Scanner;

public class Burclar {
	/*
	 * 4-Koç Burcu : 21 Mart - 20 Nisan 5-Boğa Burcu : 21 Nisan - 21 Mayıs 6-İkizler
	 * Burcu : 22 Mayıs - 22 Haziran 7-Yengeç Burcu : 23 Haziran - 22 Temmuz 8-Aslan
	 * Burcu : 23 Temmuz - 22 Ağustos 9-Başak Burcu : 23 Ağustos - 22 Eylül
	 * 10-Terazi Burcu : 23 Eylül - 22 Ekim 11-Akrep Burcu : 23 Ekim - 21 Kasım
	 * 12-Yay Burcu : 22 Kasım - 21 Aralık 1-Oğlak Burcu : 22 Aralık - 21 Ocak
	 * 2-Kova Burcu : 22 Ocak - 19 Şubat 3-Balık Burcu : 20 Şubat - 20 Mart
	 */

	public static void main(String[] args) {
		  	Scanner scan = new Scanner(System.in);
	        System.out.print("->Doğduğunuz Ayı Giriniz : ");
	        int ay=scan.nextInt();
	        System.out.print("->Doğduğunuz Günü Giriniz : ");
	        int gun=scan.nextInt();

	        if(ay==1) {
	            if (gun <= 21)
	                System.out.println("->Oğlak Burcu<-");
	            else
	                System.out.println("->Kova Burcu<-");
	        }
	        if(ay==2){
	            if(gun<=19)
	                System.out.println("->Kova Burcu<-");
	            else
	                System.out.println("->Balık Burcu<-");
	        }
	        if(ay==3){
	            if (gun<=20)
	                System.out.println("->Balık Burcu<-");
	            else
	                System.out.println("->Koç Burcu<-");
	        }
	        if(ay==4){
	            if(gun<=20)
	                System.out.println("->Koç Burcu<-");
	            else
	                System.out.println("->Boğa Burcu<-");
	        }
	        if(ay==5){
	            if(gun<=21)
	                System.out.println("->Boğa Burcu<-");
	            else
	                System.out.println("->İkizler Burcu<-");
	        }
	        if(ay==6){
	            if(gun<=22)
	                System.out.println("->İkizler Burcu<-");
	            else
	                System.out.println("->Yengeç Burcu<-");
	        }
	        if(ay==7){
	            if(gun<=22)
	                System.out.println("->Yengeç Burcu<-");
	            else
	                System.out.println("->Aslan Burcu<-");
	        }
	        if(ay==8){
	            if(gun<=22)
	                System.out.println("->Aslan Burcu<-");
	            else
	                System.out.println("->Başak Burcu<-");
	        }
	        if(ay==9){
	            if(gun<=22)
	                System.out.println("->Başak Burcu<-");
	            else
	                System.out.println("->Terazi Burcu<-");
	        }
	        if(ay==10){
	            if(gun<=22)
	                System.out.println("->Terazi Burcu<-");
	            else
	                System.out.println("->Akrep Burcu<-");
	        }
	        if(ay==11){
	            if(gun<=21)
	                System.out.println("->Akrep Burcu<-");
	            else
	                System.out.println("->Yay Burcu<-");
	        }
	        if(ay==12){
	            if(gun<=21)
	                System.out.println("->Yay Burcu<-");
	            else
	                System.out.println("->Oğlak Burcu<-");
	        }
	    }
	}