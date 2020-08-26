package vize2;

import java.util.Scanner;

public class soru3 {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   System.out.print("Sayý giriniz: ");
		   int sayi=sc.nextInt();
	       int toplam=0;
	      
	        for (int i = 1; i <= sayi/2; i++) {
	            if (sayi % i ==0) {
	                toplam+=i;
	            }
	        }
	        if (sayi==toplam) {
	            System.out.println("Girdiðiniz sayý özel sayýdýr.");
	        }
	        else 
	        	System.out.println("Girdiðiniz Sayý özel sayý deðildir.");
	    }
	  
	  
	}
