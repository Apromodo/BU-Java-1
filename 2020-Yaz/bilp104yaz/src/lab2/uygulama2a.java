package lab2;

import java.util.Scanner;

public class uygulama2a {

	public static void main(String[] args) {
		
		int tktmiktar;
		double tkttutar,atiksu,toplam;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("�lk G�sterge       : ");
		int ilk = sc.nextInt();
		Scanner sc2=new Scanner(System.in);
		System.out.print("Son G�sterge       : ");
		int son = sc2.nextInt();
		
		tktmiktar = son-ilk;
		tkttutar = tktmiktar * 0.6;
		atiksu = tkttutar / 2;
		toplam = tkttutar + atiksu;
		
		System.out.println("-------------------");
		System.out.println("T�ketim miktar�    : "+tktmiktar);
		System.out.println("T�ketim Tutar�     : "+tkttutar);
		System.out.println("At�k Su Bedeli     : "+atiksu);
		System.out.println("Toplam             : "+toplam+" TLdir");
	}

}
