
public class Villa extends Ev{
	
	public boolean havuz;

	public Villa(int yuzolcumu,int odasayısı,boolean havuz) {
		
	
	
	super(yuzolcumu,odasayısı);
	this.havuz=havuz;
	
	}
	
	 public int fiyatBul(int odasayısı,int yuzolcumu,boolean havuz) {
			
			int fiyatBul=odasayısı*yuzolcumu;
			if(havuz)
				fiyatBul*=1000;
			return fiyatBul;
		}
	 
}
