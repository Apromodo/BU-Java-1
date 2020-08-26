package vize2;

public class soru2 {
	
	public static void main(String[] args) {
		
		int enkucuk,enbuyuk;
        int[] dizi = {4,9,6,5,1};
        
        enbuyuk = dizi[0];
        enkucuk = dizi[0];
        
        for (int i = 0; i < dizi.length; i++){
            if (dizi[i] > enbuyuk) {
            	enbuyuk = dizi[i];
            }
        }
        for (int i = 0; i < dizi.length; i++){
            if (dizi[i] < enkucuk) {
            	enkucuk = dizi[i];
            }
        }
        System.out.println("Dizideki en büyük deðer: " + enbuyuk);
        System.out.println("Dizideki en büyük deðer: " + enkucuk);
       
    }
}
