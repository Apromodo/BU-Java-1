package bilp104yaz;

import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
		
		int ales,yds;
		Scanner sc=new Scanner(System.in);
		System.out.print("ALES puanýný giriniz : ");
		ales=sc.nextInt();
		System.out.print("YDS puanýnýzý giriniz :");
		yds=sc.nextInt();
		System.out.println("-----------------------");
		if(ales>=70 && yds>=55) {
			System.out.print("Baþvuru Yapabilirsiniz");
		}
		else {
			System.out.print("Baþvuru Yapamazsýnýz");
		}

	}
}
