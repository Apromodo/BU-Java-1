package lab6;

import java.util.Scanner;

public class lab6soru1 {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Ay De�erini Giriniz= ");
		String ay=scanner.next();
		System.out.println("--------------------");	
		
		
		if(ay.equals("Ocak") || ay.equals("ocak")) {
			System.out.println("Girdi�iniz Ay Y�l�n 1. Ay�d�r.");
		}
		else if(ay.equals("�ubat") || ay.equals("�ubat")) {
			System.out.println("Girdi�iniz Ay Y�l�n 2. Ay�d�r.");
		}
		else if(ay.equals("Mart") || ay.equals("mart")) {
			System.out.println("Girdi�iniz Ay Y�l�n 3. Ay�d�r.");
		}
		else if(ay.equals("Nisan") || ay.equals("nisan")) {
			System.out.println("Girdi�iniz Ay Y�l�n 4. Ay�d�r.");
		}
		else if(ay.equals("May�s") || ay.equals("may�s")) {
			System.out.println("Girdi�iniz Ay Y�l�n 5. Ay�d�r.");
		}
		else if(ay.equals("Haziran") || ay.equals("haziran")) {
			System.out.println("Girdi�iniz Ay Y�l�n 6. Ay�d�r.");
		}
		else if(ay.equals("Temmuz") || ay.equals("Temmuz")) {
			System.out.println("Girdi�iniz Ay Y�l�n 7. Ay�d�r.");
		}
		else if(ay.equals("A�ustos") || ay.equals("a�ustos")) {
			System.out.println("Girdi�iniz Ay Y�l�n 8. Ay�d�r.");
		}
		else if(ay.equals("Eyl�l") || ay.equals("eyl�l")) {
			System.out.println("Girdi�iniz Ay Y�l�n 9. Ay�d�r.");
		}
		else if(ay.equals("Ekim") || ay.equals("ekim")) {
			System.out.println("Girdi�iniz Ay Y�l�n 10. Ay�d�r.");
		}
		else if(ay.equals("Kas�m") || ay.equals("kas�m")) {
			System.out.println("Girdi�iniz Ay Y�l�n 11. Ay�d�r.");
		}
		else if(ay.equals("Aral�k") || ay.equals("aral�k")) {
			System.out.println("Girdi�iniz Ay Y�l�n 12. Ay�d�r.");
		}
		else {
			System.out.println("Girdi�iniz ay ad� yanl��t�r.");
		}
	}
}