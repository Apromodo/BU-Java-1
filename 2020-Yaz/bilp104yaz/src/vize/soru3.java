package vize;

import java.util.Scanner;

public class soru3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Say� giriniz : ");
		int sayi=sc.nextInt();
		
		if(sayi>=51 && sayi<=149) {
			System.out.println("100 say�s�na daha yak�nd�r");
		}
		else if(sayi>=151 && sayi<=249) {
			System.out.println("200 say�s�na daha yak�nd�r");
		}
		if(sayi==150) {
			System.out.println("�ki say�ya e�it uzakl�ktad�r");
		}

	}

}
