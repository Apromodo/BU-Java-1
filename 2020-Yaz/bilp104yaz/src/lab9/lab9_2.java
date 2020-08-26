package lab9;

import java.util.Scanner;

public class lab9_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Noktalarýn koordinatlarýný giriniz:");
		System.out.print("(Sýrasýyla x1 y1 x2 y2): ");
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();
		
		System.out.println("------------------");
		if(x1<x2 && y1<y2) {
			System.out.println("Orjine daha yakýn olan noktanýn koordinatlarý: "+"x="+x1+" y="+y1);
		}
		else
			System.out.println("Orjine daha yakýn olan noktanýn koordinatlarý: "+x2+y2);
	}
	public class Nokta {
	
	private double x;
	private double y;
	
	public Nokta(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Nokta kordinatlar x= " + x + " y=" + y;
	}
	public boolean equals(Nokta digerNokta) {
		if(this.x== digerNokta.x && this.y==digerNokta.y)
			return true;
		else
			return false;		
		}
	}
}




