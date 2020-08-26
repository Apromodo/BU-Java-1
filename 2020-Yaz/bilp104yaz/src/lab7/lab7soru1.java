package lab7;

import java.util.Scanner;

public class lab7soru1 {

	public static void main(String[] args) {
		int sayac = 0; 
		int  toplam=0, ort;
		for (int i = 0; i < 10; i++){
		Scanner sc=new Scanner(System.in);
		System.out.print("Sayýlarý giriniz (5 Adet) : ");
		int sayi1=sc.nextInt();
		int sayi2=sc.nextInt();
		int sayi3=sc.nextInt();
		int sayi4=sc.nextInt();
		int sayi5=sc.nextInt();
		

		
		if (sayi1 % 3 == 0 || sayi2 % 3==0 || sayi3 % 3 == 0 || sayi4 % 3==0 || sayi5 % 3==0){
			toplam += sayi1;
			toplam += sayi2;
			toplam += sayi3;
			toplam += sayi4;
			toplam += sayi5;
			sayac++;
			sayac++;
			sayac++;
			sayac++;
			sayac++;
		} if (sayi1 % 4 == 0 || sayi2 % 4 == 0 || sayi3 % 4 == 0 || sayi4 % 4 == 0 || sayi5 % 4 == 0){
			toplam += sayi1;
			toplam += sayi2;
			toplam += sayi3;
			toplam += sayi4;
			toplam += sayi5;
			sayac++;
			sayac++;
			sayac++;
			sayac++;
			sayac++;
		} if (sayi1 % 9 != 0 || sayi2 % 9 != 0 || sayi3 % 9 != 0 || sayi4 % 9 != 0 || sayi5 % 9 != 0){
			toplam += sayi1;
			toplam += sayi2;
			toplam += sayi3;
			toplam += sayi4;
			toplam += sayi5;
			sayac++;
			sayac++;
			sayac++;
			sayac++;
			sayac++;
		}

		
		ort = toplam / sayac;
		System.out.println("Ortalamasý = "+ort);
		
		} 
	}
}


