package lab3;

import java.util.Scanner;

public class soru2 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Çapý giriniz (cm)     : ");
		double cap=sc.nextDouble();
		double hacim=((Math.PI*4/3)*Math.pow(cap, 3));
		System.out.println("----------------------------");
		System.out.println("Kürenin hacmi: "+hacim+" cm küptür");
		
	}
}
