
public class YazOkulu7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Ogrenci ogrenci1=new Ogrenci();
		
		ogrenci1.ad="Kaya";
		ogrenci1.soyad="Ünal";
		ogrenci1.numara=217217;
		
		System.out.println(ogrenci1.ad);
		System.out.println(ogrenci1.soyad);
		System.out.println(ogrenci1.numara);
		
		Ogrenci ogrenci2=new Ogrenci();
		ogrenci2.ad="kaan";
		ogrenci2.soyad="hardal";
		ogrenci2.numara=216216;
		
		System.out.println(ogrenci2.ad);
		System.out.println(ogrenci2.soyad);
		System.out.println(ogrenci2.numara);
		
		
		
	Araba araba1=new Araba();
	
	araba1.marka="BMW";
	araba1.model=2005;
	araba1.renk="kırmızı";
	
	System.out.println(araba1.marka);
	System.out.println(araba1.model);
	System.out.println(araba1.renk);
	
	
		*/
		
		
		int[] dizi=new int[3];  //dizi=array
		
		dizi[0]=6;
		dizi[1]=8;
		dizi[2]=2;
		
		int[] dizi2=new int[] {4,7,2,1,0};
		String[] dizi3=new String[] { "kaya","kaan"};
		String[] dizi4=new String[3];
		dizi4[0] ="kaya";
		dizi4[1] ="kaan";
		
		for( int i=0 ; i<dizi4.length;  i++)
			System.out.println(dizi4[i]);
		
		
		
		int[] dizi27=new int[] {};
		 
		int enBuyuk=dizi[0];
		int enKucuk=dizi[0];
		
		
		for(int i=0 ; i<dizi.length;  i++) {
			
			if(enBuyuk<dizi[i]) {
				enBuyuk=dizi[i];
			}
		
				if(enKucuk>dizi[i]) {
					enKucuk=dizi[i];
				}
		}
		
		
		
			System.out.println(enBuyuk);
			System.out.println(enKucuk);
		
		double toplam=0;
		for(int i=0 ; i<dizi.length;  i++) {
			toplam+=dizi[i];
		
		}
		System.out.println(toplam);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
