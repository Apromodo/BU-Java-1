
public class Ders {

	public String ad;
	public String kod;
	
	//varsayılan yapılandırıcı(defult construcker)
	
	public Ders() {
		System.out.println("bir ders nesnesi oluşturuldu");
	}
	
	public Ders(String ad) {
	this.ad=ad;
		
	}
	
	
	public Ders(String ad, String kod) {
		this.ad=ad;
		this.kod=kod;
	}
	
	/*
	private String ad;
	private String kod;
	
	
	
	public void setadAd(String ad) {
		this.ad=ad;
	}
		public void setKod(String kod) {
			this.kod=kod;
		}

       public String getAd() {
	       return this.ad;
       }
       
       public String getKod() {
	       return this.kod;
       }
		*/
		
}
