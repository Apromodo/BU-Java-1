package lab2;

public class uygulama2c {

	public static void main(String[] args) {
		int sayi=1234;
		System.out.println(sayi+" say�s�nda");
		
		int binler=sayi/1000;
		sayi=sayi-binler*1000;
		int yuzler=sayi/100;
		sayi=sayi-yuzler*100;
		int onlar=sayi/10;
		sayi=sayi-onlar*10;
		int birler=sayi/1;
		sayi=sayi-birler*1;
		System.out.println(binler+" Adet binlik");
		System.out.println(yuzler+" Adet y�zl�k");
		System.out.println(onlar+" Adet onluk");
		System.out.println(birler+" Adet birlik");
	}
}
