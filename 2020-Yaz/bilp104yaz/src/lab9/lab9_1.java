package lab9;

import java.util.Scanner;

public class lab9_1 {

	public static void main(String[] args) {
		
		int birTLAgirlik=10;
		int elliKurusAgirlik=6;
		int ybKurusAgirlik=4;
		int onKurusAgirlik=2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Paralarýn aðýrlýklarýnýn sýrasýyla gram cinsinden giriniz");
		System.out.print("(Sýrasýyla 1TL, 50 Kuruþ, 25 Kuruþ, 10 Kuruþ): ");
		int birtl=sc.nextInt();
		int ellikurus=sc.nextInt();
		int yirmibeskurus=sc.nextInt();
		int onkurus=sc.nextInt();
		
		int toplam1tl=birtl/birTLAgirlik;
		int toplam50kr=ellikurus/elliKurusAgirlik;
		toplam50kr=toplam50kr/2;
		int toplam25kr=yirmibeskurus/ybKurusAgirlik;
		toplam25kr=toplam25kr/4;
		int toplam10kr=onkurus/onKurusAgirlik;
		toplam10kr=toplam10kr/10;
		
		double toplam=toplam1tl+toplam50kr+toplam25kr+toplam10kr;
		System.out.println("--------------------------------");
		System.out.println("Paralarýn toplam ederi = "+toplam);

	}
	public class cevirTL {
		
	
	}
}
