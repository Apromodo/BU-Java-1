package lab2;

import java.util.Scanner;

public class uygulama2b {

	public static void main(String[] args) {
		        double ortalama,lablar,vize,finall;
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Vize notunu giriniz");
		        vize=sc.nextDouble();
		        System.out.println("3 Laboratuvar notunu giriniz");
		        lablar=sc.nextDouble();
		        System.out.println("Final notunu giriniz");
		        finall=sc.nextDouble();
		        ortalama =vize*0.3 + lablar*0.2 + finall*0.5;
		        System.out.println("Aðýrlýklý not ortolamasý : "+ortalama);
		            
		            
	}
}
