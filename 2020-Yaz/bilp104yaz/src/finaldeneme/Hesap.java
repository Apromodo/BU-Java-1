package finaldeneme;

public class Hesap {
	
	
private int bakiye;

	
	
	public void ayarla(int bakiye) {
		this.bakiye = bakiye;
	}
	
	public void hesapOzeti() {
		
		if(bakiye<0) {
			bakiye = 0;
		}
		
		else {
			
		}
		System.out.println("Hesap bakiyesi: " + bakiye + "TL. dir");	
	}

	public void paraYatir(int yatirilan) {
		System.out.println("Para Yatirma i�lemi");
		 bakiye = bakiye + yatirilan;
		 System.out.println(" ");

		
	}
	

	public int paraCek(int cekilen) {
		System.out.println("Para �ekme ��lemi");
		 bakiye = bakiye - cekilen;
		 System.out.println(" ");
		 return cekilen;
	}

}
