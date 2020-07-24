package lab3;

import java.util.Scanner;

public class soru1 {

	public static void main(String[] args) {
		
		int x1,x2,y1,y2;
		double mesafe;
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		System.out.print("Birinci noktanýn koordinat deðerini giriniz (x1,y1) : ");
		x1=sc.nextInt();
		y1=sc.nextInt();
		System.out.print("Ýkinci noktanýn koordinat deðerini giriniz (x2,y2) : ");
		x2=sc2.nextInt();
		y2=sc2.nextInt();
		
		mesafe=Math.sqrt((Math.pow(x1-x2, 2))+((Math.pow(y1-y2, 2))));
		System.out.println("--------------------------------------------------");
		System.out.println("Aralarýndaki mesafe   = "+mesafe);
		
		
	}

}
