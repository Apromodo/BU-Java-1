
public class Kitap {

	private String ad;
	private String yazar;
	private int sayfasayısı;
	
	
	public void setAd(String ad) {
		this.ad=ad;
	}
	public void setYazar(String yazar) {
		this.yazar=yazar;
	}
	
	public void setSsayısı(int sayfasayısı) {
		this.sayfasayısı=sayfasayısı;
	}
	
	public String getAd() {
		return this.ad;
	}
	
	public String getYazar() {
		return this.yazar;
		
	}
	
	public int getSsayısı() {
		return this.sayfasayısı;
		
	}
	//public Kitap(String ad, String yazar , int sayfasayısı) {
	//	this.ad=ad;
	//	this.yazar=yazar;
	//	this.sayfasayısı=sayfasayısı;
		
	//}
	
}
