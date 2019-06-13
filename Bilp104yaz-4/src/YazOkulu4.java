import java.util.Scanner;

public class YazOkulu4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner girisNesnesi=new Scanner(System.in);
		double sure=girisNesnesi.nextDouble();
		double borc=0.0;
		if(sure<1)
			borc=5;
		else if(sure<5)
			borc=20;
		else if(sure<10)
			borc=40;
		else
			borc=40+0.5*(sure-10);
			

		System.out.println("borcun "+borc+"TL koçum");
   }
		
}	
		
		
		
		