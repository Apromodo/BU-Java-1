package vize2;

import java.util.ArrayList;
import java.util.Scanner;

public class soru1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String[] dizi= {"ankara","izmir","istanbul","antalya","muðla"};
        System.out.print("Aradýðýnýz il adýný giriniz: ");

        String arananString = sc.next();
        
        
        if(arananString.toLowerCase().equals("ankara")) {
        	System.out.println(arananString+" Ýller dizisinde vardýr.");
       
        }
        else if(arananString.toLowerCase().equals("izmir")) {
        	System.out.println(arananString+" Ýller dizisinde vardýr.");
       
        }
        else if(arananString.toLowerCase().equals("istanbul")) {
        	System.out.println(arananString+" Ýller dizisinde vardýr.");
       
        }
        else if(arananString.toLowerCase().equals("antalya")) {
        	System.out.println(arananString+" Ýller dizisinde vardýr.");
       
        }
        else if(arananString.toLowerCase().equals("muðla")) {
        	System.out.println(arananString+" Ýller dizisinde vardýr.");
       
        }
        else {
        	System.out.println(arananString+" Ýller dizisinde yoktur.");
        }

	}

}
