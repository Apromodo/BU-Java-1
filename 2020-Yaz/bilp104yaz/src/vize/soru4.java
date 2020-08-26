package vize;

import java.util.Scanner;

public class soru4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("String giriniz : ");
		String string=sc.next();
		Scanner sc2=new Scanner(System.in);
		System.out.println("Sayý giriniz : ");
		int str=sc2.nextInt();
		
		
		System.out.println("---------------------");

	    System.out.println("A þýkký : "+string.substring(string.length()-1)+string.substring(0)+string.substring(string.length()-1));
		System.out.println("B þýkký 1. String: "+string.substring(0,1)+string.substring(2,3)+string.substring(4,5));
	    System.out.println("B þýkký 2. String: "+string.substring(1,2)+string.substring(3,4)+string.substring(5,6));
	    System.out.println("C þýkký : "+string.substring(0,3)+string.substring(0,3)+string.substring(0,3));
	    System.out.println("D þýkký : "+string.substring(2)+string.substring(0,2));
	    System.out.println("E þýkký : "+string.substring(0,str)+string.substring(str+1, string.length()));

	}

}
