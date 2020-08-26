package vize;

import java.util.Scanner;

public class soru2 {

	public static void main(String[] args) {
		double biletUcret=10;
		Scanner sc=new Scanner(System.in);
		System.out.print("Kisi sayisi giriniz : ");
		int kisi=sc.nextInt();
		Scanner sc2=new Scanner(System.in);
		System.out.print("Bilet tipini giriniz: ");
		String tip=sc2.next();
		System.out.println("-------------------------------");
		double indirim20=biletUcret*0.80;
		double indirim25=biletUcret*0.75;
		double indirim30=biletUcret*0.70;
		
		if(kisi<=9 && tip.equals("Ogrenci")) {
			biletUcret = kisi*indirim25;
			System.out.println("Bir bilet ucreti    : "+indirim25);
			System.out.print("Toplam bilet ucreti :"+biletUcret);
		}
		else if(kisi>=10 && tip.equals("Ogrenci")) {
			biletUcret = kisi*indirim30;
			System.out.println("Bir bilet ucreti    : "+indirim30);
			System.out.print("Toplam bilet ucreti :"+biletUcret);
		}
		else {
			biletUcret = kisi*indirim20;
			System.out.println("Bir bilet ucreti    : "+indirim20);
			System.out.print("Toplam bilet ucreti : "+biletUcret);
		}
	}
}
