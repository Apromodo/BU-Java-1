package lab4;

import java.util.Scanner;

public class lab4soru1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Richter cinsinden deprem b�y�kl���n� giriniz= ");
		double richter=sc.nextDouble();
		System.out.println("---------------------------------------------");
		if(richter<5.0) {
			System.out.println("Ufak veya Hasars�z");
		}
		else if(richter>=5.0 && richter <=5.5) {
			System.out.println("Az hasarl�.");
		}
		else if(richter>=5.5 && richter <=6.5) {
			System.out.println("Ciddi hasar: �atlamalar ve ��kmeler olabilir");
		}
		else if(richter>=6.5 && richter <=7.5) {
			System.out.println("Felaket: Evler ve binalar ��kebilir.");
		}
		else if(richter>=7.5) {
			System.out.println("Facia: B�t�n yap�lar yok olur");
		}
	}

}
