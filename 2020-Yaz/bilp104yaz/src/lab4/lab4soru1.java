package lab4;

import java.util.Scanner;

public class lab4soru1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Richter cinsinden deprem büyüklüðünü giriniz= ");
		double richter=sc.nextDouble();
		System.out.println("---------------------------------------------");
		if(richter<5.0) {
			System.out.println("Ufak veya Hasarsýz");
		}
		else if(richter>=5.0 && richter <=5.5) {
			System.out.println("Az hasarlý.");
		}
		else if(richter>=5.5 && richter <=6.5) {
			System.out.println("Ciddi hasar: Çatlamalar ve çökmeler olabilir");
		}
		else if(richter>=6.5 && richter <=7.5) {
			System.out.println("Felaket: Evler ve binalar çökebilir.");
		}
		else if(richter>=7.5) {
			System.out.println("Facia: Bütün yapýlar yok olur");
		}
	}

}
