package bilp104yaz;

import java.util.Scanner;

public class MainClas {

	public static void main(String[] args) {
		int sayi,a,b,c,d,e,x,y,z;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Sayýyý giriniz : ");
		sayi=sc.nextInt();
		System.out.println("--------------------");
		a=sayi/10000;
		b=(sayi-(a*10000))/1000;
		c=(sayi-(a*10000)-(b*1000))/100;
		d=(sayi-(a*10000)-(b*1000)-(c*100))/10;
		e=sayi-(a*10000)-(b*1000)-(c*100)-(d*10);
		x=(c*100)+(d*10)+e;
		y=(a*10000)+((b+1)*1000);
		z=(a*10000)+(b*1000);
		if (x>500){ 
			System.out.println("Girilen "+sayi+" sayýsýnýn yuvarlatýlmýþ hali "+y+" dir");
		}
		else {
			System.out.println("Girilen "+sayi+" sayýsýnýn yuvarlatýlmýþ hali "+z+" dir");
		}
	}
}
