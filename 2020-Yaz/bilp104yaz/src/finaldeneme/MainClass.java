package finaldeneme;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Hesap hesap = new Hesap();	
		
		
		hesap.ayarla(3000);
		hesap.hesapOzeti();
		
		hesap.paraYatir(1000);
		hesap.hesapOzeti();
		
		int cekilenMiktar = hesap.paraCek(3000);
		System.out.println("�ekilen miktar: " + cekilenMiktar + "TL.");
		
		cekilenMiktar = hesap.paraCek(2000);
		System.out.println("�ekim miktar�: " + cekilenMiktar + "TL.");
		hesap.hesapOzeti();

	}

}
