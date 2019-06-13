import java.util.Scanner;

public class YazOkulu8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		int[] numaralar=new int[] {85,28,336,77,12};
		String[] isimler=new String[] {"kaya","kaan","emre","öner","tartan"};
		
		//soru kulanıcının girmiş oldugu sayının kime ait oldugunu yazın
		
		System.out.println("bir sayı giriniz ");
		Scanner scanner=new Scanner(System.in);
		
		int numara=scanner.nextInt();
		int indis=-1;
		for(int i=0; i<numaralar.length;i++) {
			
			if(numara==numaralar[i]) {
				indis=i;
				break;
				
				
			}
				
			}
		if(indis!=-1)
		System.out.println("girdiginiz numara "+isimler[indis]);
		else //indis==-1 yani girilen numara numaralar dizisinde içinde bulunmuyorsa
			//indisi aradıgnız ilk deger oalrak -1 olarak kalmıştır
			
			System.out.println("girdiginiz numara kayıtlı degil ");
		
		
		
		
		int[] notlar=new int[10];
		int toplam=0;
        double ortalama;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("10 adet not giriniz ");
		
		for(int i=0;i<10;i++) {
			notlar[i]=scanner.nextInt();
			toplam+=notlar[i];
			
		}
			ortalama=toplam/10;
			System.out.println("ortalamadan büyük notlar");
			for(int i=0;i<10;i++) {
				 
	           if(notlar[i]>ortalama) {
					
					System.out.println(notlar[i]);
				}
	       }
			
			*/
			
		 int[] sayi=new int[5];

	        Scanner scanner=new Scanner(System.in);

	        System.out.println("5 adet sayi girin ");

	        for(int i=0;i<5;i++) {

	            sayi[i]=scanner.nextInt();

	           
	        }

	            int[] sayi2=new int[5];

	           
	            Scanner scanner2=new Scanner(System.in);

	            System.out.println("yeniden 5 adet sayi girin");
	            
	            
	            for(int i=0;i<5;i++) {

	                sayi2[i]=scanner.nextInt();           
	            
	            
	            }
	   
	            System.out.println("toplamı"+sayi+sayi2);
	     
	    }
	}