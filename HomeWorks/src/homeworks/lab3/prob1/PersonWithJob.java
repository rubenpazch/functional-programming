package lab3.prob1;

public class PersonWithJob {
	
	private double salary;
	private Person operson;
	
	public double getSalary() {
		return salary;
	}
	
	PersonWithJob(Person n, double s) {
		//super(n);
		salary = s;
		operson = n;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)aPerson;
		boolean isEqual = this.operson.equals(p) && this.getSalary()==p.getSalary();
		return isEqual;
	}
	
	public static void main(String[] args) {
		
		Person p2 = new Person("Joe");
		PersonWithJob p1 = new PersonWithJob(p2, 30000);
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}


}
