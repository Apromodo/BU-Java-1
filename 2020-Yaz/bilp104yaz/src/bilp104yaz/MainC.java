package bilp104yaz;

import java.util.Scanner;

public class MainC {

	public static void main(String[] args) {
		double anne,baba,cocuk = 0;
		String cinsiyet;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("�ocu�un cinsiyetini giriniz(e,E-k,K)  : ");
		cinsiyet=sc.next();
		Scanner sc2=new Scanner(System.in);
		System.out.print("Babas�n�n Boyu(m) : ");
		baba=sc2.nextDouble();
		Scanner sc3=new Scanner(System.in);
		System.out.print("Annesinin Boyu(m) : ");
		anne=sc3.nextDouble();

		if(cinsiyet.equals("E") || cinsiyet.equals("e")) {
			cocuk=(baba+anne+0.13)/2;
			System.out.println("----------------");
			System.out.println("Hedef Boy : "+cocuk);
			if(cocuk<=1.75) {
				System.out.println("T�rkiye Ortalamas�ndan daha k�sa olacak");
			}
			else {
				System.out.println("T�rkiye Ortalamas�ndan daha uzun olacak");
			}
		}
		else if(cinsiyet=="k" || cinsiyet=="K") {
			cocuk=(baba+anne-0.13)/2;
			System.out.println("-----------------");
			System.out.println("Hedef Boy : "+cocuk);
			if(cocuk<=1.63) {
				System.out.println("T�rkiye Ortalamas�ndan daha k�sa olacak");
			}
			else {
				System.out.println("T�rkiye Ortalamas�ndan daha uzun olacak");
			}
			
		}
		else {
			System.out.println("L�tfen E,e veya K,k �eklinde Cinsiyet Giriniz.!");
		}
	}
}
