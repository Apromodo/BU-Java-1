package lab3;

import java.util.Scanner;

public class soru4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ýçeriði giriniz.");
		String icerik = sc.nextLine();
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Etiketi giriniz.");
		String etiket = sc2.nextLine();
		
		System.out.println("<"+etiket+">"+icerik+"</"+etiket+">");
		

	}

}
