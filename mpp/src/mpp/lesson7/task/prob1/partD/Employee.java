package mpp.lesson7.task.prob1.partD;

public class Employee {
	private String name;
	private int salary;
	private boolean visited = false;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void setVisited(boolean b) {
		visited = b;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override 
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Employee)) return false;
		Employee emp = (Employee)ob;
		return emp.name.equals(name) && emp.salary == salary ;//&& emp.visited == visited;
	}
	
	@Override
	public int hashCode() {
		int result = 17;
		long longval = Double.doubleToLongBits(salary);
		int salaryHash = (int) (longval ^ (longval >>> 32));
		result += 31 * result + name.hashCode();
		result += 31 * result + salaryHash;
		//result += 31 * result + (visited ? 1 : 0);
		return result;
	}
	
	
/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		result = prime * result + (visited ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		if (visited != other.visited)
			return false;
		return true;
	}
	*/
	
	
}
