package f�nal;

import java.util.Scanner;

public class soru1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Hesap a��l���: s�rayla usd ve tl miktar� giriniz:");
		int tl=sc.nextInt();
		int usd=sc.nextInt();
		Hesap hesap=new Hesap(usd,tl);
		hesap.yazdir();
		System.out.println("---------------------------------------------------------");
		
		Scanner sc2=new Scanner(System.in);
		System.out.print("Yapamak istedi�iniz i�lemi se�iniz(1-Para Yat�rma, 2-Para �ekme): ");
		int islem=sc2.nextInt();
		
		if(islem == 1) {
			Scanner sc3=new Scanner(System.in);
			System.out.print("Para yat�rmak istedi�iniz hesab� se�iniz.(USD veya TL) :");
			String secilenHesap=sc3.next();
			if(secilenHesap.equals("USD")) {
				Scanner sc4=new Scanner(System.in);
				System.out.print("Hesaba yat�rmak istedi�iniz miktar� giriniz: ");
				int usdMiktar=sc4.nextInt();
				hesap.usdYatir(usdMiktar);
				hesap.yazdir();
				System.out.println("------------------------------------------------");
			}
			else if(secilenHesap.equals("TL")) {
				Scanner sc5=new Scanner(System.in);
				System.out.print("Hesaba yat�rmak istedi�iniz miktar� giriniz: ");
				int tlMiktar=sc5.nextInt();
				hesap.tryYatir(tlMiktar);
				hesap.yazdir();
				System.out.println("------------------------------------------------");
			}
			else {
				System.out.println("Ge�ersiz hesap ad�.");
				hesap.yazdir();
				System.out.println("------------------------------------------------");
			}
		}
		
		
		
		
		
		
//		---------------------------------------------------------------------------
		
		
		
		
		
		
		
		else if(islem == 2) {
			Scanner sc3=new Scanner(System.in);
			System.out.print("Para �ekmek istedi�iniz hesab� se�iniz.(USD veya TL) :");
			String secilenHesap=sc3.next();
			if(secilenHesap.equals("USD")) {
				Scanner sc4=new Scanner(System.in);
				System.out.print("Hesaptan �ekmek istedi�iniz miktar� giriniz: ");
				int usdMiktar=sc4.nextInt();
				hesap.usdCek(usdMiktar);
				hesap.yazdir();
				System.out.println("------------------------------------------------");
			}
			else if(secilenHesap.equals("TL")) {
				Scanner sc5=new Scanner(System.in);
				System.out.print("Hesaptan �ekmek istedi�iniz miktar� giriniz: ");
				int tlMiktar=sc5.nextInt();
				hesap.tryCek(tlMiktar);
				hesap.yazdir();
				System.out.println("------------------------------------------------");
			}
			else {
				System.out.println("Ge�ersiz hesap ad�.");
				hesap.yazdir();
				System.out.println("------------------------------------------------");
			}
		}
		
		else {
			System.out.println("Ge�ersiz i�lem.");
			hesap.yazdir();
			System.out.println("------------------------------------------------");
		}

	}

}
