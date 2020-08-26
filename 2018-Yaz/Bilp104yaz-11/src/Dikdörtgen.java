
public class Dikdörtgen extends Kare {
	
	public double boy;
	
	public Dikdörtgen(double en,double boy) {
		super(en);
		this.boy=boy;
	}
	
       public double alan(double en,double boy) {
		
		double alan=en*boy;
		return alan;
}

       public double cevre(double en,double boy) {
   		
   		double cevre=2*(en+boy);
   		return cevre;
   }
       
}
