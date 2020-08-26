
public class Ogrenci {
	
	public String ad;
	public String soyad;
	public int numara;
	
	public Ogrenci(String ad,String soyad,int numara) {
		this.ad=ad;
		this.soyad=soyad;
		this.numara=numara;
	}

	public void Ogrencigörüntüle() {
		System.out.println(ad+" "+soyad+" "+numara);
		
	}
	
}
