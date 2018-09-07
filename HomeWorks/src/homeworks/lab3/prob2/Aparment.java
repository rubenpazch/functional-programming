package lab3.prob2;

public class Aparment {
	private String name;
	private double rent;
	
	public Aparment(String poname, double porent) {
		// TODO Auto-generated constructor stub
		name=poname;
		rent= porent; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	@Override
	public String toString() {
		return "Aparment [name=" + name + ", rent=" + rent + "]";
	}
	
	
	
	
}
