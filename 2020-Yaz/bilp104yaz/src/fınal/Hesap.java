package fınal;

public class Hesap {

	
	private int usd;
	private  int tl;
	
	public Hesap(int tl, int usd) {
		super();
		this.tl = tl;
		this.usd = usd;
		System.out.println("Hesap açıldı.");
	}
	
	public void tryYatir(int yatan) {
	
		tl=tl+yatan;
	}
	
	public void usdYatir(int yatan) {
		
		usd=usd+yatan;
	}
	
	public void tryCek(int cekilen) {
		
		tl=tl-cekilen;
	}
	
	public void usdCek(int cekilen) {
		usd=usd-cekilen;
	}
	
	public void yazdir() {
		if(tl<0) {
			
			tl = 0;
		}
		
		else {
			
		}
		
		
		
		if(usd<0) {
			
			usd = 0;
		}
		
		else {
			
		}
		
		System.out.println("TL Bakiye: "+tl+" TL. USD Bakiye : "+usd+" USD");
	}
}
