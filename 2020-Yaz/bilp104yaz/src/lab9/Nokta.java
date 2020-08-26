package lab9;

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