package lab6;

import java.util.Scanner;

public class lab6soru3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Hangi günde (1..7) ve kaç kiþi tura katýlacaksýnýz: ");
		int tur=sc.nextInt();
		int kisi=sc.nextInt();
		System.out.println("--------------------");
		
		switch(tur) {
		case 1:
			int toplam;
			toplam = kisi*50;
			System.out.print("Toplam Borcunuz : "+toplam);
			break;
		case 2:
			toplam = kisi*50;
			System.out.print("Toplam Borcunuz : "+toplam);
			break;
		case 3:
			toplam = kisi*50;
			System.out.print("Toplam Borcunuz : "+toplam);
			break;
		case 4:
			toplam = kisi*50;
			System.out.print("Toplam Borcunuz : "+toplam);
			break;
		case 5:
			toplam = kisi*50;
			System.out.print("Toplam Borcunuz : "+toplam);
			break;
		case 6:
			toplam = kisi*150;
			System.out.print("Toplam Borcunuz : "+toplam);
			break;
		case 7:
			toplam = kisi*250;
			System.out.print("Toplam Borcunuz : "+toplam);
			break;
		}
	}
}



