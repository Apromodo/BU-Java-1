package lab8;

import java.util.Scanner;

public class Soru1 {
	
	public static void main(String[] args) {
		 int toplam=0;
		 int ort = 0,sayac=0;
		 while(true)
		 {
			Scanner sc = new Scanner(System.in);
			System.out.print("Yaþ giriniz(Durdurmak için 0): ");
			int yas = sc.nextInt();
			if(yas==0) break;
			toplam=toplam + yas;
			sayac++;
			ort=toplam/sayac;
		}
		System.out.println("-----------------------------------");
		System.out.println("Toplam "+sayac+" kiþi katýldý");
		System.out.println("Ortalama= "+ort+", Kýrpýlmýþ ortalama= ");
	}
}


