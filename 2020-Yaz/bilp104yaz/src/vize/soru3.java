package vize;

import java.util.Scanner;

public class soru3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Sayı giriniz : ");
		int sayi=sc.nextInt();
		
		if(sayi>=51 && sayi<=149) {
			System.out.println("100 sayısına daha yakındır");
		}
		else if(sayi>=151 && sayi<=249) {
			System.out.println("200 sayısına daha yakındır");
		}
		if(sayi==150) {
			System.out.println("İki sayıya eşit uzaklıktadır");
		}

	}

}
