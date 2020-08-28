package fýnal;

import java.util.Scanner;

public class soru1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Hesap açýlýþý: sýrayla usd ve tl miktarý giriniz:");
		int tl=sc.nextInt();
		int usd=sc.nextInt();
		Hesap hesap=new Hesap(usd,tl);
		hesap.yazdir();
		System.out.println("---------------------------------------------------------");
		
		Scanner sc2=new Scanner(System.in);
		System.out.print("Yapamak istediðiniz iþlemi seçiniz(1-Para Yatýrma, 2-Para Çekme): ");
		int islem=sc2.nextInt();
		
		if(islem == 1) {
			Scanner sc3=new Scanner(System.in);
			System.out.print("Para yatýrmak istediðiniz hesabý seçiniz.(USD veya TL) :");
			String secilenHesap=sc3.next();
			if(secilenHesap.equals("USD")) {
				Scanner sc4=new Scanner(System.in);
				System.out.print("Hesaba yatýrmak istediðiniz miktarý giriniz: ");
				int usdMiktar=sc4.nextInt();
				hesap.usdYatir(usdMiktar);
				hesap.yazdir();
				System.out.println("------------------------------------------------");
			}
			else if(secilenHesap.equals("TL")) {
				Scanner sc5=new Scanner(System.in);
				System.out.print("Hesaba yatýrmak istediðiniz miktarý giriniz: ");
				int tlMiktar=sc5.nextInt();
				hesap.tryYatir(tlMiktar);
				hesap.yazdir();
				System.out.println("------------------------------------------------");
			}
			else {
				System.out.println("Geçersiz hesap adý.");
				hesap.yazdir();
				System.out.println("------------------------------------------------");
			}
		}
		
		
		
		
		
		
//		---------------------------------------------------------------------------
		
		
		
		
		
		
		
		else if(islem == 2) {
			Scanner sc3=new Scanner(System.in);
			System.out.print("Para çekmek istediðiniz hesabý seçiniz.(USD veya TL) :");
			String secilenHesap=sc3.next();
			if(secilenHesap.equals("USD")) {
				Scanner sc4=new Scanner(System.in);
				System.out.print("Hesaptan çekmek istediðiniz miktarý giriniz: ");
				int usdMiktar=sc4.nextInt();
				hesap.usdCek(usdMiktar);
				hesap.yazdir();
				System.out.println("------------------------------------------------");
			}
			else if(secilenHesap.equals("TL")) {
				Scanner sc5=new Scanner(System.in);
				System.out.print("Hesaptan çekmek istediðiniz miktarý giriniz: ");
				int tlMiktar=sc5.nextInt();
				hesap.tryCek(tlMiktar);
				hesap.yazdir();
				System.out.println("------------------------------------------------");
			}
			else {
				System.out.println("Geçersiz hesap adý.");
				hesap.yazdir();
				System.out.println("------------------------------------------------");
			}
		}
		
		else {
			System.out.println("Geçersiz iþlem.");
			hesap.yazdir();
			System.out.println("------------------------------------------------");
		}

	}

}
