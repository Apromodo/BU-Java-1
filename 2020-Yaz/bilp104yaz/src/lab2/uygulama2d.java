package lab2;

import java.util.Scanner;

public class uygulama2d {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("(ax�+bx+c) ikinci dereceden bir denklemdir.\n Denklemdeki sabitleri a�a��daki gibi s�rayla girin"); 
        
        System.out.print("a de�erini giriniz :"); 
        double a = sc.nextInt(); 
        System.out.print("b de�erini giriniz :"); 
        double b = sc.nextInt(); 
        System.out.print("c de�erini giriniz :"); 
        double c = sc.nextInt(); 
        double delta = (b * b) - (4 * a * c); 
        if (delta > 0){ 
            double x1 = ((-1 * b) + Math.sqrt(delta)) / (2 * a); 
            double x2 = ((-1 * b) - Math.sqrt(delta)) / (2 * a); 
            System.out.println("x1= " + x1 + " x2= " + x2); 
        } 
        else if (delta < 0){
            System.out.println("Denklemin Ger�el K�k� Yoktur."); 
        } 
        else { 
            double x = (-1 * b) / (2 * a);
            System.out.println("�ak���k k�k� var \nx1="+x+" x2= "+x); 
        }
	} 
}

