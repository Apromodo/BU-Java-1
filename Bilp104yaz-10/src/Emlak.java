
public class Emlak {
	
	public String semt;
	public int yuzolcum;
	public Emlak() {
		
	}
	
	
	public Emlak(String semt,int yuzolcumu) {
		this.semt=semt;
		this.yuzolcum=yuzolcumu;
		
	}
	
	public int fiyathesapla(int birimfiyat) {
		
		int fiyat=yuzolcum*birimfiyat;
		return fiyat;
	}
	
	//yuzolcumu 200 metre kare semti baglıca
	//olan bir emlak nesnesi oluşturdunuz
	//bu nesnein fiyatını 100 birim fiyatı için
	//main methodu içine yazdırınız

	public int fiyathesapla(int birimfiyat,int indirim,boolean imarizni) {
		int fiyat=yuzolcum*birimfiyat;
		fiyat=fiyat-fiyat*indirim/100;
		if(imarizni)
			fiyat*=1.5;
		return fiyat;
	}
		
		
		//bir sınıf içerisinde birden fazla method tanımlaya biliriz bunu için farklı method ımzasu kukkanılır
		
		
		
	}

