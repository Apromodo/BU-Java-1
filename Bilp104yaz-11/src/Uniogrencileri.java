
public class Uniogrencileri extends Ogrenci{

	public String bolum;
	
	public Uniogrencileri(String ad,String soyad,int numara,String bolum)
	
	{
		super(ad,soyad,numara);
		this.bolum=bolum;
	}
		
	public void Ogrencigörüntüle() {
		System.out.println(ad+" "+soyad+" "+numara+" "+bolum);
		
	}
}
