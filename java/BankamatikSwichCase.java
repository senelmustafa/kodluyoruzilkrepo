package Patika;

import java.util.Scanner;

public class BankamatikSwichCase {

	public static void main(String[] args) {
		//BANKAMATİK
		//::..MUSTAFA ŞENEL..::
		
		  String userName, password;
	        Scanner scan  = new Scanner(System.in);
	        int sayac = 3;
	        int bakiye = 500;
	        int secim;
	        while (sayac > 0) {
	            System.out.print("Kullanıcı Adınız :");
	            userName = scan .nextLine();
	            System.out.print("Parolanız : ");
	            password = scan .nextLine();

	            if (userName.equals("admin") && password.equals("123")) {
	                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
	                
	                int price;
	                
	                do {
	                    System.out.println("1-Para yatırma\n" +
	                            "2-Para Çekme\n" +
	                            "3-Bakiye Sorgula\n" +
	                            "4-Çıkış Yap");
	                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
	                    secim = scan .nextInt();
	                    
	                    switch (secim) {
	                        case 1:
	                            System.out.print("Para miktarı : ");
	                            price = scan .nextInt();
	                            bakiye += price;
	                            break;
	                        case 2:
	                            System.out.print("Para miktarı : ");
	                            price = scan .nextInt();
	                            if (price > bakiye) {
	                                System.out.println("Bakiye yetersiz.");
	                            } else {
	                                bakiye -= price;
	                            }
	                            break;
	                        case 3:
	                            System.out.println("Bakiyeniz : " + bakiye);
	                            break;
	                    }
	                } while (secim != 4);
	                System.out.println("Tekrar görüşmek üzere.");
	                break;
	            } else {
	                sayac--;
	                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
	                if (sayac == 0) {
	                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
	                } else {
	                    System.out.println("Kalan Hakkınız : " + sayac);
	                }
	            }
	        }
	    }
	}