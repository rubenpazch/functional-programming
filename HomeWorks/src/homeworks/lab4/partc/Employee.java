package lab4.partc;

public abstract class Employee {
	private int empId;
	
	public Employee (int empId) {
		this.empId=empId;
	}
	
	public Paycheck calcCompensation(int month, int year) {
		Paycheck pay = new Paycheck(calcGrossPay(month, year));
		pay.print();
		return pay;
	} 
	
	abstract double calcGrossPay(int month, int year); 
	
	public void print () {
		System.out.println("Id : "+ empId);
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
	
}
