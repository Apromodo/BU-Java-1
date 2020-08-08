package bilp104yaz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String kullanici="Gokhan";
		int sifre=1234;
		Scanner sc=new Scanner(System.in);
		System.out.println("Kullanýcý Adýný Giriniz.");
		String kadi=sc.next();
		System.out.println("Lütfen Þifreyi Giriniz.");
		int sfre=sc.nextInt();
		if(kadi.equals(kullanici)&& sfre==sifre) {
			System.out.println("Giriþ Yapýldý");
		}
		else {
			System.out.println("Kullanýcý Adý Veya Þifre Yanlýþ");
		}

	}

}
