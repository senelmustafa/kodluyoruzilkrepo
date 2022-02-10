package Patika;

import java.util.Scanner;

public class SayiSirala {
//Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
	        System.out.println("Sayıları küçükten büyüğe sıralama programı");
	         

	        System.out.print("1.Sayıyı giriniz :");
	        int a=scan.nextInt();

	        System.out.print("2.Sayıyı giriniz :");
	        int b=scan.nextInt();

	        System.out.print("3.Sayıyı giriniz :");
	        int c=scan.nextInt();

	        if(a<b && a<c){
	            if(b>c)
	                System.out.println(""+a+"<"+c+"<"+b);
	            else
	                System.out.println(""+a+"<"+b+"<"+c);
	        }

	        if(b<a && b<c){
	            if (a>c)
	                System.out.println(""+b+"<"+c+"<"+a);
	            else
	                System.out.println(""+b+"<"+a+"<"+c);
	        }

	        else
	        {
	            if(a>b)
	                System.out.println(""+c+"<"+b+"<"+a);
	            else
	                System.out.println(""+c+"<"+a+"<"+b);
	        }
	    }
	}