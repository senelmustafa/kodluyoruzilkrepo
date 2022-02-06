package Java_Ornekler;

import java.util.Scanner;

public class NotOrtHesaplama1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
        Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...
        */
        Scanner scan =new Scanner(System.in);

        System.out.println("Matematik Notunu Giriniz :");
        int mat=scan.nextInt();

        System.out.println("Fizik Notunu Giriniz :");
        int fzk=scan.nextInt();

        System.out.println("Kimya Notunu Giriniz :");
        int kmy=scan.nextInt();

        System.out.println("Türkçe Notunu Giriniz :");
        int trc=scan.nextInt();

        System.out.println("Tarih Notunu Giriniz :");
        int trh=scan.nextInt();

        System.out.println("Müzik Notunu Giriniz :");
        int mzk=scan.nextInt();
        int ort=(mat+fzk+kmy+trc+trh+mzk)/6;
        System.out.print(ort>=60 ? "Sınıfı Geçti":"Sınıfta Kaldı");

    }
    
}
