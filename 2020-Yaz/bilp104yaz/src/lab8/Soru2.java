package lab8;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		 int toplam=0;
		 int saysayac=0,sozsayac=0,easayac=0,dilsayac=0;
		 
		 while(true)
		 {
			Scanner sc = new Scanner(System.in);
			System.out.print("Kod giriniz(SAY,EA,SÖZ,DÝL yada çýkmak için Q): ");
			String kod = sc.next();
			if(kod.equals("Q") || kod.equals("q")) break;	
			if(kod.equals("say") || kod.equals("SAY")){
				saysayac++;
			}
			else if(kod.equals("ea") || kod.equals("EA")){
				easayac++;
			}
			else if(kod.equals("söz") || kod.equals("SÖZ")){
				sozsayac++;
			}
			else if(kod.equals("dil") || kod.equals("DÝL")){
				dilsayac++;
			}
			else {
				System.out.println("Hata!! Lütfen geçerli bir kod giriniz");
			}
		}
		System.out.println(" ");
		System.out.println("Kayýt Raporu:");
		System.out.println(saysayac+" SAY, "+easayac+" EA, "+sozsayac+" SÖZ, "+dilsayac+" DÝL öðrenci kayýt olmuþtur. ");

	}

}
