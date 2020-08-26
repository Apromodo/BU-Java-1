package vize;

import java.util.Scanner;

public class soru5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Başlangıç ve bitiş değerini giriniz: ");
		int bas=sc.nextInt();
		int son=sc.nextInt();
		Scanner sc2=new Scanner(System.in);
		System.out.print("Sayı giriniz: ");
		int sayi=sc2.nextInt();
		System.out.println("Girilen sayı "+"["+bas+","+son+"] "+"aralığındadır");
		System.out.println("--------------------------");

		for(int sayi2=sayi;sayi>10;sayi2++) {
			return;
			
		}
	}
}
