package lab4;

import java.util.Scanner;

public class lab4soru2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Notunuzu giriniz: ");
		int not=sc.nextInt();
		System.out.println("---------------------------------------------");
		if(not>=95 && not <=100) {
			System.out.println("A");
		}
		else if(not>=90 && not <=94) {
			System.out.println("A-");
		}
		else if(not>=85 && not <=89) {
			System.out.println("B+");
		}
		else if(not>=80 && not <=84) {
			System.out.println("B");
		}
		else if(not>=75 && not <=79) {
			System.out.println("B-");
		}
		else if(not>=70 && not <=74) {
			System.out.println("C+");
		}
		else if(not>=65 && not <=69) {
			System.out.println("C");
		}
		else if(not>=60 && not <=64) {
			System.out.println("C-");
		}
		else if(not>=55 && not <=59) {
			System.out.println("D+");
		}
		else if(not>=50 && not <=54) {
			System.out.println("D");
		}
		else if(not>=0 && not <=49) {
			System.out.println("F1");
		}
		else {
			System.out.println("F2");
		}

	}

}
