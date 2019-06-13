
public class Ogrenci {
	public String ad;
	public String soyad;
	public int numara;

	
	public Ogrenci(String ad,String soyad,int numara) {
	this.ad=ad;
	this.soyad=soyad;
	this.numara=numara;
}
	public void bilgiGoruntule(){
		System.out.println(this.ad+" "+this.soyad+" "+this.numara);
		
		
	}
	
	
}