package bilp104yaz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String kullanici="Gokhan";
		int sifre=1234;
		Scanner sc=new Scanner(System.in);
		System.out.println("Kullan�c� Ad�n� Giriniz.");
		String kadi=sc.next();
		System.out.println("L�tfen �ifreyi Giriniz.");
		int sfre=sc.nextInt();
		if(kadi.equals(kullanici)&& sfre==sifre) {
			System.out.println("Giri� Yap�ld�");
		}
		else {
			System.out.println("Kullan�c� Ad� Veya �ifre Yanl��");
		}

	}

}
