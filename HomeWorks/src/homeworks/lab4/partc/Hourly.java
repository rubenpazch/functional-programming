package lab4.partc;

public class Hourly extends Employee{
	
	private int hourlyWage;
	private int hourPerWeek;
	
	
	
	public Hourly(int empId, int hourlyWage, int hourPerWeek) {
		super(empId);
		this.hourlyWage = hourlyWage;
		this.hourPerWeek = hourPerWeek;
	}

	@Override
	double calcGrossPay(int month, int year) {
		return hourlyWage*hourPerWeek*4;
	}

	public int getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(int hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public int getHourPerWeek() {
		return hourPerWeek;
	}

	public void setHourPerWeek(int hourPerWeek) {
		this.hourPerWeek = hourPerWeek;
	}

}
