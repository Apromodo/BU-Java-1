import java.util.Scanner;

public class YazOkulu6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Scanner scanner=new Scanner(System.in);
		System.out.println("bir sayı giriniz ");
		int sayi=scanner.nextInt();
		boolean bolunebilir=false;  //sayi 1 ve kendisinden başka sayıya
		                        // sayıya bölünebiliyorsa true yapacak (2,sayı -1)
		
		
		int bolen=2;
		while(bolen<sayi) {
			if(sayi%bolen==0) {
				bolunebilir=true;
				break;                 // koşulu saglıyorsa döngüden çık
			}
				
			bolen++;
			
		}
		
		if(bolunebilir)
		System.out.println("girdiginiz sayı asal degil ");
		else
		System.out.println("girdiginiz sayı asal");
		
		
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("bir sayı giriniz");
		int sayi=scanner.nextInt();
		int cevap=6;
		
		
		while(cevap!=sayi) {
			if(cevap>sayi
					System.out.println("sayı küçük");
			System.out.println("bir sayi giriniz");
			sayi=scanner.nextInt();
			if(cevap)
		}
		System.out.println("TEBRİKLER DOGRU");
		*/
		Scanner scanner=new Scanner(System.in);
		System.out.println("1. sayıyı girin");
		int sayi1=scanner.nextInt();
		System.out.println("bir sayı girin");
		int sayi2=scanner.nextInt();
		int sayac=sayi1;
		while(sayac<=sayi2) {
		
		if(sayac%5==0)
			System.out.println(sayac);
		sayac++;
		
		}
	}

}
