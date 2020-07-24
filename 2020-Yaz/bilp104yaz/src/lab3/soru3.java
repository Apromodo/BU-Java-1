package lab3;

import java.util.Scanner;

public class soru3 {

	public static void main(String[] args) {
        String string;
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir string giriniz.");
        string=sc.next();
        
        System.out.println(string.substring(2)+string.substring(0,2)); 

	}

}
