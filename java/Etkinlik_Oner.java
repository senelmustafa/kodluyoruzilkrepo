package Java_Ornekler;

import java.util.Scanner;

public class Etkinlik_Oner {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("Hava Sıcaklığını Giriniz \t:");
		Scanner scan = new Scanner(System.in);
		int hava = scan.nextInt();

		if (hava <= 4) {
			System.out.println("Hava Kayak Yapmaya Çok Müsayit");
		} else if (hava <= 5 || hava < 15) {
			System.out.println("Sinama İzlemeye Ne Dersin?");

		} else if (hava <= 15 || hava < 25) {
			System.out.println("Pikniğe gitmelisin");
		} else if (hava >= 25) {

			System.out.println("Hadi Seninle Yüzmeye Gidelim..");
		}
	}

}
