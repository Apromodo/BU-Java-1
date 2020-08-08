package lab6;

import java.util.Scanner;

public class lab6soru1 {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Ay Deðerini Giriniz= ");
		String ay=scanner.next();
		System.out.println("--------------------");	
		
		
		if(ay.equals("Ocak") || ay.equals("ocak")) {
			System.out.println("Girdiðiniz Ay Yýlýn 1. Ayýdýr.");
		}
		else if(ay.equals("Þubat") || ay.equals("þubat")) {
			System.out.println("Girdiðiniz Ay Yýlýn 2. Ayýdýr.");
		}
		else if(ay.equals("Mart") || ay.equals("mart")) {
			System.out.println("Girdiðiniz Ay Yýlýn 3. Ayýdýr.");
		}
		else if(ay.equals("Nisan") || ay.equals("nisan")) {
			System.out.println("Girdiðiniz Ay Yýlýn 4. Ayýdýr.");
		}
		else if(ay.equals("Mayýs") || ay.equals("mayýs")) {
			System.out.println("Girdiðiniz Ay Yýlýn 5. Ayýdýr.");
		}
		else if(ay.equals("Haziran") || ay.equals("haziran")) {
			System.out.println("Girdiðiniz Ay Yýlýn 6. Ayýdýr.");
		}
		else if(ay.equals("Temmuz") || ay.equals("Temmuz")) {
			System.out.println("Girdiðiniz Ay Yýlýn 7. Ayýdýr.");
		}
		else if(ay.equals("Aðustos") || ay.equals("aðustos")) {
			System.out.println("Girdiðiniz Ay Yýlýn 8. Ayýdýr.");
		}
		else if(ay.equals("Eylül") || ay.equals("eylül")) {
			System.out.println("Girdiðiniz Ay Yýlýn 9. Ayýdýr.");
		}
		else if(ay.equals("Ekim") || ay.equals("ekim")) {
			System.out.println("Girdiðiniz Ay Yýlýn 10. Ayýdýr.");
		}
		else if(ay.equals("Kasým") || ay.equals("kasým")) {
			System.out.println("Girdiðiniz Ay Yýlýn 11. Ayýdýr.");
		}
		else if(ay.equals("Aralýk") || ay.equals("aralýk")) {
			System.out.println("Girdiðiniz Ay Yýlýn 12. Ayýdýr.");
		}
		else {
			System.out.println("Girdiðiniz ay adý yanlýþtýr.");
		}
	}
}