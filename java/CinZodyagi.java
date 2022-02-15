package Patika;

import java.util.Scanner;

public class CinZodyagi {

	public static void main(String[] args) {
		System.out.println("Doğum Tarihini Giriniz :");
		Scanner scan=new Scanner(System.in);
		int tarih=scan.nextInt();
		if(tarih%12==0) {System.out.println("Çin Zodyağı Burcunuz : Maymun");	}
		if(tarih%12==1) {System.out.println("Çin Zodyağı Burcunuz : Horoz");	}
		if(tarih%12==2) {System.out.println("Çin Zodyağı Burcunuz : Köpek");	}
		if(tarih%12==3) {System.out.println("Çin Zodyağı Burcunuz : Domuz");	}
		if(tarih%12==4) {System.out.println("Çin Zodyağı Burcunuz : Fare");	}
		if(tarih%12==5) {System.out.println("Çin Zodyağı Burcunuz : Öküz");	}
		if(tarih%12==6) {System.out.println("Çin Zodyağı Burcunuz : Kaplan");	}
		if(tarih%12==7) {System.out.println("Çin Zodyağı Burcunuz : Tavşan");	}
		if(tarih%12==8) {System.out.println("Çin Zodyağı Burcunuz : Ejderha");	}
		if(tarih%12==9) {System.out.println("Çin Zodyağı Burcunuz : Yılan");	}
		if(tarih%12==10) {System.out.println("Çin Zodyağı Burcunuz : At");		}
		if(tarih%12==11) {System.out.println("Çin Zodyağı Burcunuz : Koyun");	}
		scan.close();
}
}