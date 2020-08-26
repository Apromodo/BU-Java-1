
public class kullanıcı {
	
	private String adSoyad;
	private int yas;
	
	
	
	public void setadSoyad(String adSoyad) {
		this.adSoyad=adSoyad;
		
		if(adSoyad.length()>25)
			System.out.println("ad-soyad uzunlugu 25 karakteri geçemez");
		else
			this.adSoyad=adSoyad;
	}
	
	public void setYas(int yas) {
		if(yas>110)
			System.out.println("yas max 110 girilebilir");
		else
			this.yas=yas;
	
	}
}
