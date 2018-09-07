package lab4.partc;

public class Salaried extends Employee{
	
	private double salary;
	
	
	public Salaried(int empId, double salary) {
		super(empId);
		this.salary = salary;
	}

	@Override
	double calcGrossPay(int month, int year) {
		return salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
