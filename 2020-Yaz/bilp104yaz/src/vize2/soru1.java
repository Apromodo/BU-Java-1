package vize2;

import java.util.ArrayList;
import java.util.Scanner;

public class soru1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String[] dizi= {"ankara","izmir","istanbul","antalya","mu�la"};
        System.out.print("Arad���n�z il ad�n� giriniz: ");

        String arananString = sc.next();
        
        
        if(arananString.toLowerCase().equals("ankara")) {
        	System.out.println(arananString+" �ller dizisinde vard�r.");
       
        }
        else if(arananString.toLowerCase().equals("izmir")) {
        	System.out.println(arananString+" �ller dizisinde vard�r.");
       
        }
        else if(arananString.toLowerCase().equals("istanbul")) {
        	System.out.println(arananString+" �ller dizisinde vard�r.");
       
        }
        else if(arananString.toLowerCase().equals("antalya")) {
        	System.out.println(arananString+" �ller dizisinde vard�r.");
       
        }
        else if(arananString.toLowerCase().equals("mu�la")) {
        	System.out.println(arananString+" �ller dizisinde vard�r.");
       
        }
        else {
        	System.out.println(arananString+" �ller dizisinde yoktur.");
        }

	}

}
