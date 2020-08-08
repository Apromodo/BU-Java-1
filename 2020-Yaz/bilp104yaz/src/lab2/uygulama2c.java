package lab2;

import java.util.Scanner;

public class uygulama2c {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Lütfen Öðrenmek Ýstediðiniz Sayýyý Girin: ");
		int sayi = sc.nextInt();

		System.out.println(sayi+" sayýsýnda");
		int binler=sayi/1000;
		sayi=sayi-binler*1000;
		int yuzler=sayi/100;
		sayi=sayi-yuzler*100;
		int onlar=sayi/10;
		sayi=sayi-onlar*10;
		int birler=sayi/1;
		sayi=sayi-birler*1;
		System.out.println(binler+" Adet binlik");
		System.out.println(yuzler+" Adet yüzlük");
		System.out.println(onlar+" Adet onluk");
		System.out.println(birler+" Adet birlik");
	}
}
