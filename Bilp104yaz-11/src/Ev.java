
public class Ev {

	public int yuzolcumu;
	public int odasayısı;
	
	public Ev(int yuzolcumu,int odasayısı){
		this.odasayısı=odasayısı;
		this.yuzolcumu=yuzolcumu;
	}
	
      public int fiyatBul(int yuzolcumu,int odasayısı) {
		
		int fiyatBul=yuzolcumu*odasayısı;
		return fiyatBul;
	}
	
	
}
