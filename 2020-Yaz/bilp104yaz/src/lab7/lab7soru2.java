package lab7;

import java.util.Scanner;

public class lab7soru2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mesajý giriniz: ");
        String kelime = sc.nextLine();
        kelime=kelime.toLowerCase();
        int i, sayac = 0;

        for (i = 0; i < kelime.length(); i++) {

            if (kelime.charAt(i) == 'x') {
                if (kelime.charAt(i + 1) == 'y') {
                        sayac++;
                }
            }
        }
        System.out.println("Mesajda xy " + sayac + " adet geçiyor");

    }
}
