package Patika;

import java.util.Scanner;

public class Sifre {
	/*
	 * Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını
	 * sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
	 * ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı
	 * ise ekrana "Şifre oluşturulamadı, lütfen başka şifre
	 * giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String kullanici = "admin";
		String sifre = "1234";

		System.out.println("Kullanıc Adını Giriniz :");
		String kAdi = scan.nextLine();
		System.out.println("Şifrenizi Giriniz :");
		String sifreGir = scan.nextLine();

		if ((kAdi.equals("admin")) && (sifreGir.equals("1234"))) {
			System.out.println("Doğru");

		} else {

			System.out.println("Şifreyi sıfırlamak istiyor musunuz?\n1-EVET\n2-HAYIR");
			int sifirla = scan.nextInt();

			switch (sifirla) {
			case 1:
				System.out.println("Şifre bir öncekiyle aynı olmamalıdır.\n");
				System.out.print("Yeni kullanıcı adı giriniz :");
				String yAd = scan.next();
				System.out.print("Yeni şifre giriniz :");
				String ySifreGir = scan.next();

				if ((yAd.equals("admin") && (ySifreGir.equals("1234")))) {

					System.out.print("en son kullandığınız k.Adı ve şifre giremezsiniz\n");
					System.out.println("Yeni kullanıcı adı giriniz :");
					String yAd1 = scan.next();
					System.out.print("Yeni şifre giriniz :");
					String ySifreGir1 = scan.next();
					kullanici = yAd1;
					sifre = ySifreGir1;
					System.out.println("kullanıcı adınız :" + kullanici + "  Şifre :" + sifre);

				} else {

				}
				break;
			case 2:
				System.out.println("Çıkış İşlemi Yapıldı..");
				break;
			default:
				System.out.println("K.Adı ve Şifre Doğru");
				break;
			}
		}
	}
}
