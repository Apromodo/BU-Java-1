package lab8;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		 int toplam=0;
		 int saysayac=0,sozsayac=0,easayac=0,dilsayac=0;
		 
		 while(true)
		 {
			Scanner sc = new Scanner(System.in);
			System.out.print("Kod giriniz(SAY,EA,S�Z,D�L yada ��kmak i�in Q): ");
			String kod = sc.next();
			if(kod.equals("Q") || kod.equals("q")) break;	
			if(kod.equals("say") || kod.equals("SAY")){
				saysayac++;
			}
			else if(kod.equals("ea") || kod.equals("EA")){
				easayac++;
			}
			else if(kod.equals("s�z") || kod.equals("S�Z")){
				sozsayac++;
			}
			else if(kod.equals("dil") || kod.equals("D�L")){
				dilsayac++;
			}
			else {
				System.out.println("Hata!! L�tfen ge�erli bir kod giriniz");
			}
		}
		System.out.println(" ");
		System.out.println("Kay�t Raporu:");
		System.out.println(saysayac+" SAY, "+easayac+" EA, "+sozsayac+" S�Z, "+dilsayac+" D�L ��renci kay�t olmu�tur. ");

	}

}
