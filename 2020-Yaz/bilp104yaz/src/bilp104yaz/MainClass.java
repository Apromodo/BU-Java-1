package bilp104yaz;

import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
		
		int ales,yds;
		Scanner sc=new Scanner(System.in);
		System.out.print("ALES puan�n� giriniz : ");
		ales=sc.nextInt();
		System.out.print("YDS puan�n�z� giriniz :");
		yds=sc.nextInt();
		System.out.println("-----------------------");
		if(ales>=70 && yds>=55) {
			System.out.print("Ba�vuru Yapabilirsiniz");
		}
		else {
			System.out.print("Ba�vuru Yapamazs�n�z");
		}

	}
}
